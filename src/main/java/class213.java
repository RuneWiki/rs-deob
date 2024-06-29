import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class213 extends class166 {

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Z")
    public static boolean field3869 = false;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "[S")
    public static short[] field3875 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Lhj;")
    public static class69 field3879 = class181.method1318("Lade Schrifts-=tze )2 ", (byte) -111);

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
    public static int[] field3878 = new int[128];

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(II)Lr;")
    public static final class39 method1533(int arg0, int arg1) {
        ++field3877;
        class39 var2 = (class39) class166.field3055.method1714((long) arg1, (byte) -124);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class53.field943.method590(class182.method1328(-77, arg1), class205.method1495(arg1, (byte) 69), 0);
            class39 var4 = new class39();
            var4.field545 = arg1;
            if (arg0 != 128) {
                method1536(107);
            }
            if (var3 != null) {
                var4.method221(new class128(var3), -25347);
            }
            class166.field3055.method1705((byte) 125, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3074 = arg1.method937(false) == 1;
        }
        ++field3871;
        if (arg0 != 96) {
            this.method134(-29, -3);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)V")
    public static final void method1534(boolean arg0) {
        ++field3872;
        if (class268.field4760 == 30) {
            class115.method851(115, 25);
        }
        if (arg0) {
            field3868 = 76;
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(II)V")
    public static final void method1535(int arg0, int arg1) {
        class135 var2 = class8.method38((byte) 108, 8, arg1);
        ++field3867;
        var2.method1012((byte) -116);
        if (arg0 != -16411) {
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method1536(int arg0) {
        field3875 = null;
        if (arg0 < -70) {
            field3878 = null;
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
    public static final int method1537(int arg0, int arg1, int arg2, int arg3) {
        ++field3873;
        int var4 = arg2 / arg3;
        int var5 = arg3 + -1 & arg2;
        if (arg1 != 255) {
            return -75;
        } else {
            int var6 = arg3 + -1 & arg0;
            int var7 = arg0 / arg3;
            int var8 = class113.method842(var4, var7, (byte) -55);
            int var9 = class113.method842(var4 + 1, var7, (byte) -55);
            int var10 = class113.method842(var4, var7 + 1, (byte) -55);
            int var11 = class113.method842(var4 + 1, var7 + 1, (byte) -55);
            int var12 = class103.method767(var8, arg3, var5, var9, (byte) -63);
            int var13 = class103.method767(var10, arg3, var5, var11, (byte) -63);
            return class103.method767(var12, arg3, var6, var13, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3874;
        if (arg1 != 8388607) {
            method1536(-98);
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            for (int var4 = 0; ~var4 > ~class253.field4565; ++var4) {
                this.method1539(var4, (byte) 103, arg0);
                int[] var5 = this.method1231(126, class156.field2907, 0);
                var3[var4] = var5[class16.field214];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            field3869 = true;
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -9);
        ++field3876;
        if (super.field3064.field979) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class253.field4565 < ~var7; ++var7) {
                this.method1539(var7, (byte) 103, arg1);
                int[][] var8 = this.method1229(class156.field2907, 23580, 0);
                var4[var7] = var8[0][class16.field214];
                var5[var7] = var8[1][class16.field214];
                var6[var7] = var8[2][class16.field214];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIILed;IJZ)Z")
    public static final boolean method1538(int arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class193.method1398(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V")
    private final void method1539(int arg0, byte arg1, int arg2) {
        if (arg1 != 103) {
            field3878 = null;
        }
        ++field3870;
        int var4 = class24.field347[arg0];
        int var5 = class13.field187[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class156.field2907 = arg2;
            class16.field214 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class16.field214 = arg2;
            class156.field2907 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class156.field2907 = arg0;
            class16.field214 = class253.field4565 - arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class16.field214 = arg0;
            class156.field2907 = class146.field2691 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class16.field214 = -arg0 + class253.field4565;
            class156.field2907 = class146.field2691 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class156.field2907 = -arg0 + class146.field2691;
            class16.field214 = -arg2 + class253.field4565;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class16.field214 = arg2;
            class156.field2907 = -arg0 + class146.field2691;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class16.field214 = -arg0 + class253.field4565;
            class156.field2907 = arg2;
        }
        class16.field214 &= class12.field183;
        class156.field2907 &= class138.field2583;
    }
}
