import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class214 extends class117 {

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    private int field3544 = 4;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    private int field3547 = 4;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "J")
    public static long field3538 = 0L;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field3548 = 255;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "[Z")
    public static boolean[] field3549 = new boolean[100];

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lwd;")
    public static class162 field3536 = new class162(new byte[5000]);

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3537;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3547 = arg0.method1133((byte) 53);
            }
        } else {
            this.field3544 = arg0.method1133((byte) 53);
        }
        if (arg1 != 255) {
            field3549 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lwd;I)Ljava/lang/String;")
    public static final String method1487(class162 arg0, int arg1) {
        ++field3545;
        return arg1 <= 29 ? null : class212.method1483(32767, arg0, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field3546;
        int[][] var3 = super.field1886.method419(arg0, (byte) -113);
        if (super.field1886.field1022) {
            int var4 = class149.field2335 / this.field3547;
            int var5 = class168.field2737 / this.field3544;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method838(0, 0, class149.field2335 * var6 / var4);
            } else {
                var7 = this.method838(0, 0, 0);
            }
            int[] var8 = var7[2];
            int[] var9 = var7[0];
            int[] var10 = var3[0];
            int[] var11 = var7[1];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; ~var14 > ~class168.field2737; ++var14) {
                int var15;
                if (~var5 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class168.field2737 * var16 / var5;
                }
                var10[var14] = var9[var15];
                var13[var14] = var11[var15];
                var12[var14] = var8[var15];
            }
        }
        int var17 = -41 / ((37 - arg1) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V")
    public static final void method1489(int arg0, boolean arg1) {
        class196.field3174.method1262(arg0, 2736);
        ++field3543;
        class57.field954.method1262(arg0, 2736);
        class308.field4923.method1262(arg0, 2736);
        if (arg1) {
            field3539 = -56;
        }
    }

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)V")
    public static final void method1490(int arg0) {
        class314.field5061.method828(106, 89);
        ++field3542;
        class97 var1 = (class97) class244.field3880.method1063(-101);
        if (arg0 == 26579) {
            while (var1 != null) {
                if (var1.field1554 == 0) {
                    class285.method1897(var1, 109, true);
                }
                var1 = (class97) class244.field3880.method1055(arg0 ^ 8401);
            }
            if (class61.field994 != null) {
                class117.method834(class61.field994, (byte) -57);
                class61.field994 = null;
            }
            ++class124.field1965;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZZLdk;Ldk;)Lwl;")
    public static final class304 method1491(int arg0, boolean arg1, boolean arg2, class251 arg3, class251 arg4) {
        ++field3541;
        boolean var5 = true;
        int[] var6 = arg4.method1688(true, arg0);
        int var7 = 0;
        if (arg1) {
            method1489(36, true);
        }
        while (~var6.length < ~var7) {
            byte[] var8 = arg4.method1672(arg0, 0, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 255) << 8 | 255 & var8[1];
                byte[] var10;
                if (!arg2) {
                    var10 = arg3.method1672(var9, 0, 0);
                } else {
                    var10 = arg3.method1672(0, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            ++var7;
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class304(arg4, arg3, arg0, arg2);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public static void method1492(boolean arg0) {
        field3536 = null;
        if (arg0) {
            field3549 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method44((class162) null, -78, 51);
        }
        ++field3540;
        int[] var3 = super.field1883.method531(arg1, (byte) 64);
        if (super.field1883.field1313) {
            int var4 = class168.field2737 / this.field3544;
            int var5 = class149.field2335 / this.field3547;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method837(0, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method837(0, 0, class149.field2335 * var7 / var5);
            }
            for (int var8 = 0; class168.field2737 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class168.field2737 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }
}
