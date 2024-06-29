import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class627 extends class62 {

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    private int field9226 = 4096;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[I")
    private int[] field9229 = new int[3];

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    private int field9234 = 4096;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    private int field9237 = 409;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    private int field9233 = 4096;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "F")
    public static float field9230;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class627() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(FFFIILmba;FIIFI)[B")
    public static final byte[] method3664(float arg0, float arg1, float arg2, int arg3, int arg4, class357 arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        ++field9232;
        byte[] var11 = new byte[arg7 * arg10 * arg3];
        if (arg8 < 125) {
            method3664(-0.57989043F, 0.78154474F, 1.9633924F, -9, 22, (class357) null, -0.9983523F, 3, 110, 1.1930813F, 99);
        }
        class466.method2814(true, arg5, arg4, arg0, 0, arg10, arg2, arg3, arg1, arg9, arg7, var11, arg6);
        return var11;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method3666(108, -117, 115, -45, 9, -102);
        }
        ++field9236;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1028((byte) 123);
                            this.field9229[2] = class37.method245(var5 >> 12, 0);
                            this.field9229[1] = class37.method245(65280, var5) >> 4;
                            this.field9229[0] = class37.method245(267386880, var5 << 4);
                        }
                    } else {
                        this.field9226 = arg0.method1045(true);
                    }
                } else {
                    this.field9234 = arg0.method1045(true);
                }
            } else {
                this.field9233 = arg0.method1045(true);
            }
        } else {
            this.field9237 = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILvp;B)V")
    public static final void method3665(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field9228;
        if (arg3 != 36) {
            field9230 = 1.4625391F;
        }
        if (arg2 != null) {
            if (arg2.field2423 != null) {
                class518 var4 = new class518();
                var4.field7376 = arg2;
                var4.field7383 = arg2.field2423;
                class98.method757(var4);
            }
            class247.field3553 = arg0;
            class626.field9224 = arg2.field2434;
            class364.field4945 = arg1;
            class193.field2865 = arg2.field2415;
            class402.field5501 = arg2.field2464;
            class574.field8454 = arg2.field2540;
            class205.field3027 = arg2.field2456;
            class606.field9002 = true;
            class403.method2371(arg2, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
    public static final void method3666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9231;
        int var6 = -arg1 + arg2;
        int var7 = -arg3 + arg5;
        if (~var7 == -1) {
            if (~var6 != -1) {
                class410.method2411(arg2, arg1, false, arg3, arg4);
            }
        } else if (~var6 == -1) {
            class93.method735(true, arg5, arg3, arg4, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (~var6 > -1) {
                var6 = -var6;
            }
            boolean var8 = ~var7 > ~var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg5;
                arg3 = arg1;
                arg5 = arg2;
                arg1 = var9;
                arg2 = var10;
            }
            if (~arg5 > ~arg3) {
                int var11 = arg3;
                arg3 = arg5;
                int var12 = arg1;
                arg1 = arg2;
                arg5 = var11;
                arg2 = var12;
            }
            int var13 = arg1;
            if (arg0 != -848573300) {
                method3666(4, -127, -51, 84, -22, -44);
            }
            int var14 = -arg3 + arg5;
            int var15 = -arg1 + arg2;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg1 >= arg2 ? -1 : 1;
            if (var8) {
                for (int var18 = arg3; ~arg5 <= ~var18; ++var18) {
                    var16 += var15;
                    class604.field8993[var18][var13] = arg4;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg5; ++var19) {
                    class604.field8993[var13][var19] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field9235;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class438.field5847 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field9229[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field9237 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field9229[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field9237 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field9229[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field9237) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field9226 * var12 >> 12;
                            var9[var11] = this.field9234 * var14 >> 12;
                            var10[var11] = this.field9233 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 > -20) {
            this.field9226 = -32;
        }
        return var3;
    }
}
