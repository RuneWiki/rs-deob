import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class84 extends class273 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    private int field1376 = 4096;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    private int field1385 = 4096;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    private int field1383 = 409;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    private int field1387 = 4096;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
    private int[] field1377 = new int[3];

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "S")
    public static short field1386 = 256;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 - -arg4;
        ++field1384;
        if (arg5 != 2) {
            method671(57, (class114) null, 105, -97);
        }
        int var8 = -arg4 + arg2;
        int var9 = -arg4 + arg0;
        for (int var10 = arg3; var7 > var10; ++var10) {
            class224.method1504(arg1, arg0, arg6, class114.field1841[var10], arg5 ^ 5);
        }
        for (int var11 = arg2; ~var8 > ~var11; --var11) {
            class224.method1504(arg1, arg0, arg6, class114.field1841[var11], 7);
        }
        int var12 = arg4 + arg6;
        for (int var13 = var7; ~var8 <= ~var13; ++var13) {
            int[] var14 = class114.field1841[var13];
            class224.method1504(arg1, var12, arg6, var14, 7);
            class224.method1504(arg1, arg0, var9, var14, 7);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field1382;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method1009(101);
                            this.field1377[1] = class64.method498(65280, var5) >> 4;
                            this.field1377[0] = class64.method498(var5 << 4, 267386880);
                            this.field1377[2] = class64.method498(0, var5 >> 12);
                        }
                    } else {
                        this.field1376 = arg0.method996(65280);
                    }
                } else {
                    this.field1385 = arg0.method996(65280);
                }
            } else {
                this.field1387 = arg0.method996(65280);
            }
        } else {
            this.field1383 = arg0.method996(65280);
        }
        if (arg2 != 5) {
            this.method3(-3, 95);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILkj;II)V")
    public static final void method671(int arg0, class114 arg1, int arg2, int arg3) {
        ++field1380;
        if (class23.field365 == null && !class198.field3226) {
            if (arg1 != null && class194.method1326(arg1, (byte) 48) != null) {
                class23.field365 = arg1;
                class189.field3092 = class194.method1326(arg1, (byte) 77);
                class141.field2343 = false;
                class210.field3368 = 0;
                if (arg3 >= -1) {
                    field1386 = -41;
                }
                class14.field220 = arg0;
                class255.field4064 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Leg;")
    public static final class18 method672(int arg0, int arg1) {
        ++field1378;
        if (arg1 != -2) {
            method671(-67, (class114) null, 50, 56);
        }
        class18 var2 = (class18) class245.field3864.method1518((long) arg0, 106);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg0 <= -32769) {
                var3 = class43.field785.method900(1, 32767 & arg0, false);
            } else {
                var3 = class249.field3970.method900(1, arg0, false);
            }
            class18 var4 = new class18();
            if (var3 != null) {
                var4.method139(new class136(var3), arg1 + -123);
            }
            if (arg0 >= 32768) {
                var4.method148((byte) 116);
            }
            class245.field3864.method1514(false, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            this.method3(-22, -30);
        }
        ++field1381;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var4[0];
            int[] var6 = var3[2];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class26.field458; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field1377[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1383) {
                    var10[var11] = var12;
                    var8[var11] = var9[var11];
                    var6[var11] = var7[var11];
                } else {
                    int var14 = var9[var11];
                    int var15 = -this.field1377[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field1383) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var6[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1377[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field1383) {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var6[var11] = var16;
                        } else {
                            var10[var11] = this.field1376 * var12 >> 12;
                            var8[var11] = this.field1385 * var14 >> 12;
                            var6[var11] = this.field1387 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
