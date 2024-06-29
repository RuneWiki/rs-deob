import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class323 extends class276 implements class265 {

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lth;")
    public class354 field4560;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
    private boolean field4565;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4556 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[I")
    public static int[] field4552 = new int[256];

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "F")
    public static float field4553;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lam;")
    public static class378 field4554;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lra;")
    public static class57 field4546;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[S")
    public static short[] field4559;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Len;Lnl;IIIIIIZI)V", line = 6)
    public class323(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field4642, arg1.field4623);
        this.field4560 = new class354(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field4565 = arg1.field4677 != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Len;B)V", line = 19)
    public final void method226(class174 arg0, byte arg1) {
        if (arg1 >= 88) {
            ++field4545;
            this.field4560.method2257(arg0, -29617);
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 30)
    public static void method1996(int arg0) {
        if (arg0 != 1) {
            method1996(51);
        }
        field4556 = null;
        field4554 = null;
        field4559 = null;
        field4546 = null;
        field4552 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I", line = 45)
    public final int method225(int arg0) {
        if (arg0 <= 66) {
            field4553 = -1.0057627F;
        }
        ++field4558;
        return this.field4560.field5180;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method215(int arg0) {
        if (arg0 >= -92) {
            field4556 = null;
        }
        ++field4564;
        return this.field4560.method2259(30);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I", line = 71)
    public final int method214(int arg0) {
        if (arg0 >= -95) {
            this.method209((byte) -37, 81, (class174) null);
        }
        ++field4566;
        return this.field4560.field5174;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILen;)Lir;", line = 90)
    public final class19 method213(int arg0, class174 arg1) {
        ++field4547;
        class393 var3 = this.field4560.method2261(super.field3894, true, arg1, false, super.field3892, (byte) -127, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 > -5) {
                this.field4560 = null;
            }
            class71 var4 = arg1.method1015();
            var4.method123(super.field3892, super.field3889, super.field3894);
            class19 var5 = null;
            if (this.field4565) {
                var5 = class358.method2286(true, 1);
            }
            if (this.field4560.field5163 != null) {
                class271 var6 = this.field4560.field5163.method2492();
                arg1.method964(var3, var6, var4, var5 != null ? var5.field197[0] : null, 0);
            } else {
                var3.method775(var4, var5 == null ? null : var5.field197[0], 0);
            }
            this.field4560.method2258(super.field3892 >> 7, super.field3892 >> 7, super.field3894 >> 7, true, (byte) 126, arg1, super.field3894 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLen;)V", line = 127)
    public final void method212(byte arg0, class174 arg1) {
        if (arg0 > -29) {
            this.method206(-2, (class174) null, -66, (byte) 114, (class330) null, 19, true);
        }
        this.field4560.method2253(false, arg1);
        ++field4562;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V", line = 139)
    public static final void method1997(int arg0) {
        ++field4550;
        if (class310.field4421 == null) {
            class310.field4421 = new int[65536];
            double var1 = 0.7D + -0.015D + Math.random() * 0.03D;
            int var3 = 0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (var14 != 0) {
                        if (~var14 != -2) {
                            if (var14 == 2) {
                                var10 = var8;
                                var11 = var18;
                                var9 = var16;
                            } else if (~var14 == -4) {
                                var10 = var17;
                                var9 = var16;
                                var11 = var8;
                            } else if (~var14 == -5) {
                                var11 = var8;
                                var10 = var16;
                                var9 = var18;
                            } else if (var14 == 5) {
                                var10 = var16;
                                var9 = var8;
                                var11 = var17;
                            }
                        } else {
                            var11 = var16;
                            var9 = var17;
                            var10 = var8;
                        }
                    } else {
                        var11 = var16;
                        var10 = var18;
                        var9 = var8;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + (var22 << 16) + -16777216 - -var24;
                    class310.field4421[var3++] = var25;
                }
            }
            if (arg0 != 5027) {
                field4546 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILen;)Lmj;", line = 260)
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            this.method209((byte) 50, 84, (class174) null);
        }
        ++field4557;
        return this.field4560.method2261(0, false, arg2, false, 0, (byte) -121, arg1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Len;I)V", line = 271)
    public final void method211(class174 arg0, int arg1) {
        if (arg1 != 0) {
            field4556 = null;
        }
        ++field4567;
        class393 var3 = this.field4560.method2261(super.field3894, true, arg0, true, super.field3892, (byte) -120, 131072);
        if (var3 != null) {
            this.field4560.method2258(super.field3892 >> 7, super.field3892 >> 7, super.field3894 >> 7, false, (byte) 124, arg0, super.field3894 >> 7, var3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILen;IBLfs;IZ)V", line = 286)
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        ++field4551;
        if (arg3 == -42) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 297)
    public final void method207(byte arg0) {
        ++field4549;
        if (arg0 != 111) {
            field4559 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 307)
    public final void method224(int arg0) {
        int var2 = 30 % ((arg0 - 52) / 46);
        ++field4548;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZLen;)Z", line = 319)
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        if (!arg2) {
            this.field4560 = null;
        }
        ++field4563;
        class393 var5 = this.field4560.method2261(super.field3894, false, arg3, false, super.field3892, (byte) -112, 65536);
        if (var5 == null) {
            return false;
        } else {
            class71 var6 = arg3.method1015();
            var6.method123(super.field3892, super.field3889, super.field3894);
            return var5.method724(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)Z", line = 340)
    public final boolean method217(int arg0) {
        ++field4555;
        int var2 = 12 % ((arg0 - -60) / 37);
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)I", line = 350)
    public final int method210(int arg0) {
        if (arg0 != -23890) {
            return -101;
        } else {
            ++field4561;
            return this.field4560.field5178;
        }
    }
}
