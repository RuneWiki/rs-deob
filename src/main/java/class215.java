import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class215 extends class80 {

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    private int field3877 = -32768;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    private int field3888 = -1;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field3896 = -1;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lmk;")
    private class101 field3899 = null;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field3887;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lq;")
    private class122 field3882;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    private int field3879;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "[Z")
    public static boolean[] field3886 = new boolean[100];

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Ljd;")
    public static class86 field3889 = class122.method868("Ausw-=hlen", true);

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Ljd;")
    private static class86 field3891 = class122.method868("Drop", true);

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Ljd;")
    public static class86 field3892 = field3891;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Luk;")
    public static class96 field3880 = new class96(64);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method1519(int arg0) {
        int var1 = 0;
        field3878++;
        if (arg0 <= 33) {
            method1526((class86) null, -66);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class30.method195(var3, class248.field4406, true, var2, var1, 1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Log;")
    public static final class210 method1520(int arg0, int arg1, int arg2) {
        field3890++;
        for (class210 var3 = (class210) class3.field33.method1737((byte) 74); var3 != null; var3 = (class210) class3.field33.method1740(-8843)) {
            if (var3.field3798 && var3.method1494(108, arg2, arg0)) {
                return var3;
            }
        }
        if (arg1 != 22515) {
            method1519(-24);
        }
        return null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class236 var20 = new class236(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class248.field4406[var21][arg1][arg2] == null) {
                    class248.field4406[var21][arg1][arg2] = new class249(var21, arg1, arg2);
                }
            }
            class248.field4406[arg0][arg1][arg2].field4442 = var20;
        } else if (arg3 == 1) {
            class236 var22 = new class236(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class248.field4406[var23][arg1][arg2] == null) {
                    class248.field4406[var23][arg1][arg2] = new class249(var23, arg1, arg2);
                }
            }
            class248.field4406[arg0][arg1][arg2].field4442 = var22;
        } else {
            class110 var24 = new class110(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class248.field4406[var25][arg1][arg2] == null) {
                    class248.field4406[var25][arg1][arg2] = new class249(var25, arg1, arg2);
                }
            }
            class248.field4406[arg0][arg1][arg2].field4444 = var24;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZB)Leh;")
    private final class80 method1522(boolean arg0, byte arg1) {
        field3876++;
        boolean var3 = class78.field1536 != class35.field796;
        class117 var4 = class268.method1845(this.field3874, (byte) -41);
        if (var4.field2295 != null) {
            var4 = var4.method840(-1);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field3897 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2307;
            var6 = var4.field2273;
        } else {
            var6 = var4.field2307;
            var7 = var4.field2273;
        }
        int var8 = (var6 + 1 >> 1) + this.field3894;
        int var9 = (var6 >> 1) + this.field3894;
        int var10 = (var7 >> 1) + this.field3883;
        int var11 = (var7 + 1 >> 1) + this.field3883;
        this.method1528(var9 * 128, (byte) -115, var10 * 128);
        boolean var12 = !var3 && var4.field2270 && (this.field3888 != var4.field2261 || this.field3896 != this.field3879 && class133.field2513 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class35.field796[this.field3887];
        int var14 = var13[var9][var10] + var13[var9][var11] + var13[var8][var11] + var13[var8][var10] >> 2;
        int var15 = (this.field3894 << 7) + (var6 << 6);
        int var16 = (this.field3883 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class78.field1536[0];
        } else if (this.field3887 < 3) {
            var17 = class35.field796[this.field3887 + 1];
        }
        if (arg1 > -3) {
            return null;
        }
        boolean var18 = this.field3899 == null;
        class244 var19;
        if (this.field3882 == null) {
            var19 = var4.method828(var15, var13, var12, false, var16, var14, this.field3875, var17, -63, this.field3897, var18 ? class209.field3785 : this.field3899);
        } else {
            var19 = var4.method841(var13, this.field3879, var18 ? class209.field3785 : this.field3899, var14, var16, var12, this.field3897, var15, true, this.field3882, this.field3875, var17);
        }
        return var19 == null ? null : var19.field4358;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
    public final void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1528(((arg0 - arg4 >> 1) + arg4) * 128 + 64, (byte) -121, ((arg2 - arg3 >> 1) + arg3) * 128 + 64);
        int var6 = 57 % ((12 - arg1) / 40);
        field3895++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
    public final int method233() {
        field3884++;
        return this.field3877;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Leh;")
    private final class80 method1523(int arg0) {
        field3873++;
        if (arg0 != -19360) {
            this.field3879 = -79;
        }
        return this.method1522(false, (byte) -35);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public static void method1524(int arg0) {
        field3891 = null;
        if (arg0 != -1) {
            field3886 = null;
        }
        field3889 = null;
        field3892 = null;
        field3880 = null;
        field3886 = null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)J")
    public static final long method1525(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4445; var4++) {
            class228 var5 = var3.field4429[var4];
            if ((var5.field4122 >> 29 & 0x3L) == 2L && var5.field4137 == arg1 && var5.field4127 == arg2) {
                return var5.field4122;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljd;I)V")
    public static final void method1526(class86 arg0, int arg1) {
        field3893++;
        if (arg1 <= 29) {
            field3880 = null;
        }
        class63.method452((byte) 70);
        class244.method1667(arg0, 1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class80 var11 = this.method1523(-19360);
        field3881++;
        if (var11 != null) {
            var11.method230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3877 = var11.method233();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Leh;IIIII)V")
    public static final void method1527(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class194.field3462 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class70.field1424) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class126.field2436 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class249 var14 = class248.field4406[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class35.field796[var11][var12 + 1][var13] + class35.field796[var11][var12][var13] + class35.field796[var11][var12][var13 + 1] + class35.field796[var11][var12 + 1][var13 + 1]) / 4 - (class35.field796[arg1][arg2 + 1][arg3] + class35.field796[arg1][arg2][arg3] + class35.field796[arg1][arg2][arg3 + 1] + class35.field796[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class221 var16 = var14.field4435;
                                    if (var16 != null) {
                                        if (var16.field3966.method563()) {
                                            arg0.method562(var16.field3966, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3976 != null && var16.field3976.method563()) {
                                            arg0.method562(var16.field3976, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4445; var17++) {
                                        class228 var18 = var14.field4429[var17];
                                        if (var18 != null && var18.field4134.method563() && (var18.field4137 == var12 || var7 == var12) && (var18.field4127 == var13 || var9 == var13)) {
                                            int var19 = var18.field4135 + 1 - var18.field4137;
                                            int var20 = var18.field4128 + 1 - var18.field4127;
                                            arg0.method562(var18.field4134, (var18.field4137 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4127 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBI)V")
    private final void method1528(int arg0, byte arg1, int arg2) {
        if (this.field3882 != null) {
            int var4 = class236.field4265 - this.field3885;
            if (var4 > 100 && this.field3882.field2368 > 0) {
                int var5 = this.field3882.field2361.length - this.field3882.field2368;
                while (this.field3879 < var5 && this.field3882.field2357[this.field3879] < var4) {
                    var4 -= this.field3882.field2357[this.field3879];
                    this.field3879++;
                }
                if (var5 <= this.field3879) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3882.field2361.length; var7++) {
                        var6 += this.field3882.field2357[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field3882.field2357[this.field3879]) {
                            break label62;
                        }
                        class168.method1212(arg0, this.field3879, false, this.field3882, 1928670186, arg2);
                        var4 -= this.field3882.field2357[this.field3879];
                        this.field3879++;
                    } while (this.field3879 < this.field3882.field2361.length);
                    this.field3879 -= this.field3882.field2368;
                } while (this.field3879 >= 0 && this.field3882.field2361.length > this.field3879);
                this.field3882 = null;
            }
            this.field3885 = class236.field4265 - var4;
        }
        field3898++;
        if (arg1 > -87) {
            this.method1522(true, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIZLeh;)V")
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field3894 = arg4;
        this.field3897 = arg2;
        this.field3874 = arg0;
        this.field3887 = arg3;
        this.field3875 = arg1;
        this.field3883 = arg5;
        if (arg6 != -1) {
            this.field3882 = class133.method952(arg6, 127);
            this.field3885 = class236.field4265 - 1;
            this.field3879 = 0;
            if (this.field3882.field2360 == 0 && arg8 != null && arg8 instanceof class215) {
                class215 var10 = (class215) arg8;
                if (this.field3882 == var10.field3882) {
                    this.field3885 = var10.field3885;
                    this.field3879 = var10.field3879;
                    return;
                }
            }
            if (arg7 && this.field3882.field2368 != -1) {
                this.field3879 = (int) ((double) this.field3882.field2361.length * Math.random());
                this.field3885 -= (int) ((double) this.field3882.field2357[this.field3879] * Math.random());
                return;
            }
        }
    }
}
