import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class253 extends class456 {

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    private int field3629 = 8192;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    private int field3630 = 0;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    private int field3632 = 12288;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    private int field3637 = 2048;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    private int field3640 = 2048;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    private int field3641 = 4096;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    private int field3642 = 0;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lj;")
    public static class240 field3631 = new class240(11, 15);

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "[[B")
    public static byte[][] field3634 = new byte[1000][];

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBLre;)V", line = 5)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3629 = arg2.method2631(2530);
                                }
                            } else {
                                this.field3641 = arg2.method2631(arg1 ^ 2517);
                            }
                        } else {
                            this.field3632 = arg2.method2631(arg1 + 2475);
                        }
                    } else {
                        this.field3640 = arg2.method2631(2530);
                    }
                } else {
                    this.field3642 = arg2.method2631(2530);
                }
            } else {
                this.field3630 = arg2.method2631(arg1 ^ 2517);
            }
        } else {
            this.field3637 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            method1605(118, -52, -90, 61, -112, 73, 19);
        }
        ++field3638;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I", line = 82)
    public final int[] method33(int arg0, int arg1) {
        ++field3639;
        if (arg0 != -1) {
            return null;
        } else {
            int[] var3 = super.field6466.method2533(true, arg1);
            if (super.field6466.field6153) {
                int var4 = class14.field206[arg1] + -2048;
                for (int var5 = 0; ~var5 > ~class156.field2169; ++var5) {
                    int var6 = class288.field4397[var5] + -2048;
                    int var7 = var6 - -this.field3637;
                    int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = this.field3630 + var4;
                    int var11 = var10 < -2048 ? var10 + 4096 : var10;
                    int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                    int var13 = var6 - -this.field3642;
                    int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var15 = ~var14 < -2049 ? var14 - 4096 : var14;
                    int var16 = var4 - -this.field3640;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                    var3[var5] = !this.method1607((byte) -116, var9, var12) && !this.method1609(false, var15, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 234)
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V", line = 139)
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class27 var7 = new class27();
        var7.field355 = arg1 >> class426.field6091;
        var7.field356 = arg2 >> class426.field6091;
        var7.field347 = arg3 >> class426.field6091;
        var7.field343 = arg4 >> class426.field6091;
        var7.field349 = arg0;
        var7.field340 = arg1;
        var7.field345 = arg2;
        var7.field350 = arg3;
        var7.field337 = arg4;
        var7.field351 = arg5;
        var7.field359 = arg6;
        class454.field6460[class387.field5713++] = var7;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lak;IIIII)V", line = 162)
    public static final void method1606(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field415 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field418[var6] != null) {
                ++arg0.field415;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field415; ++var7) {
            long var8 = class275.field4190[arg1][arg2][arg3];
            while (var8 != 0L) {
                class212 var14 = class78.field1108[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field418[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class275.field4190[arg1][arg4][arg5];
            while (var10 != 0L) {
                class212 var13 = class78.field1108[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field418[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field415 - 1; ++var12) {
                arg0.field418[var12] = arg0.field418[var12 + 1];
            }
            --arg0.field415;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(BII)Z", line = 216)
    private final boolean method1607(byte arg0, int arg1, int arg2) {
        if (arg0 != -116) {
            return true;
        } else {
            ++field3633;
            int var4 = (-arg1 + arg2) * this.field3632 >> 12;
            int var5 = class489.field6853[(var4 * 255 & 1044751) >> 12];
            int var6 = (var5 << 12) / this.field3632;
            int var7 = (var6 << 12) / this.field3629;
            int var8 = this.field3641 * var7 >> 12;
            return arg1 + arg2 < var8 && -var8 < arg1 - -arg2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 240)
    public static void method1608(byte arg0) {
        field3634 = null;
        field3631 = null;
        int var1 = -21 % ((19 - arg0) / 61);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZII)Z", line = 255)
    private final boolean method1609(boolean arg0, int arg1, int arg2) {
        ++field3636;
        int var4 = (arg2 - -arg1) * this.field3632 >> 12;
        int var5 = class489.field6853[255 & var4 * 255 >> 12];
        if (arg0) {
            return true;
        } else {
            int var6 = (var5 << 12) / this.field3632;
            int var7 = (var6 << 12) / this.field3629;
            int var8 = this.field3641 * var7 >> 12;
            return var8 > -arg1 + arg2 && ~(-arg1 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 284)
    public final void method653(boolean arg0) {
        class154.method1056(108);
        if (!arg0) {
            this.method210(44, (byte) -108, (class446) null);
        }
        ++field3635;
    }
}
