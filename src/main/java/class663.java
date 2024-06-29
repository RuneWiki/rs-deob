import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class663 extends class739 {

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    private int field9332 = 0;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    private int field9330 = 8192;

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "I")
    private int field9337 = 12288;

    @OriginalMember(owner = "client!bca", name = "Q", descriptor = "I")
    private int field9342 = 2048;

    @OriginalMember(owner = "client!bca", name = "S", descriptor = "I")
    private int field9344 = 0;

    @OriginalMember(owner = "client!bca", name = "P", descriptor = "I")
    private int field9341 = 2048;

    @OriginalMember(owner = "client!bca", name = "U", descriptor = "I")
    private int field9346 = 4096;

    @OriginalMember(owner = "client!bca", name = "R", descriptor = "Lkg;")
    public static class275 field9343 = new class275(110, -1);

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!bca", name = "M", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!bca", name = "N", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!bca", name = "O", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!bca", name = "T", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static final void method3738(byte arg0) {
        if (arg0 != 109) {
            method3738((byte) 39);
        }
        class88.field1227 = 0;
        class437.field5822 = 0;
        class708.field9841 = 0;
        class582.field8144 = 0;
        ++field9335;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)V")
    public static void method3739(byte arg0) {
        if (arg0 != -46) {
            method3739((byte) 100);
        }
        field9343 = null;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        class144.method1039((byte) -24);
        ++field9339;
        if (arg0 != -21773) {
            this.field9342 = 68;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.field9341 = 102;
        }
        ++field9340;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field9330 = arg0.method2566(-2);
                                }
                            } else {
                                this.field9346 = arg0.method2566(-2);
                            }
                        } else {
                            this.field9337 = arg0.method2566(-2);
                        }
                    } else {
                        this.field9342 = arg0.method2566(-2);
                    }
                } else {
                    this.field9332 = arg0.method2566(arg2 + 1);
                }
            } else {
                this.field9344 = arg0.method2566(-2);
            }
        } else {
            this.field9341 = arg0.method2566(arg2 ^ 3);
        }
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(III)Z")
    private final boolean method3740(int arg0, int arg1, int arg2) {
        ++field9336;
        int var4 = (arg1 + arg2) * this.field9337 >> 12;
        int var5 = class195.field2670[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field9337;
        if (arg0 > -82) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field9330;
            int var8 = this.field9346 * var7 >> 12;
            return -arg1 + arg2 < var8 && ~(-arg1 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
    public static final void method3741(int arg0, int arg1) {
        class136.field1950 = arg1;
        class601.field8362 = 100;
        int var2 = 15 % ((3 - arg0) / 46);
        class389.field4973 = -1;
        class35.field563 = 3;
        ++field9333;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
    public class663() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(B)V")
    public static final void method3742(byte arg0) {
        ++field9331;
        class244.field3161 = null;
        if (arg0 != -98) {
            field9345 = 25;
        }
        if (class676.field9448 && ~class120.method926(15492) != -2) {
            class729.method4069(~class27.field484 == -4 || ~class27.field484 == -8, 0, class83.method690((byte) 82), 0, class695.method3894((byte) 80), false);
        }
        int var1 = 0;
        int var2 = 0;
        if (class676.field9448) {
            var1 = class209.method1347(arg0 ^ -98);
            var2 = class453.method2540(-106);
        }
        class708.method3967(0, var1, class540.field7482, class466.field6263 + var2, var1, var2, var2, var1 - -class356.field4586, -1);
        if (class244.field3161 != null) {
            class97.method781(class173.field2391, class356.field4586 + var1, class466.field6263 + var2, var1, (byte) -9, class97.field1357, -1412584499, class302.field3957.field3667, var2, class244.field3161, true);
            class244.field3161 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field9334;
        int[] var3 = super.field10311.method2116(arg1, (byte) 113);
        if (super.field10311.field4728) {
            int var4 = class287.field3604[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class29.field523; ++var5) {
                int var6 = class634.field8751[var5] - 2048;
                int var7 = this.field9341 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field9344 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 - -4096;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = var6 - -this.field9332;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = var4 - -this.field9342;
                int var17 = var16 < -2048 ? var16 - -4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method3743(var12, var9, (byte) -78) && !this.method3740(-124, var15, var18) ? 0 : 4096;
            }
        }
        return arg0 != -23347 ? null : var3;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIB)Z")
    private final boolean method3743(int arg0, int arg1, byte arg2) {
        ++field9338;
        int var4 = (-arg1 + arg0) * this.field9337 >> 12;
        int var5 = class195.field2670[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field9337;
        int var7 = (var6 << 12) / this.field9330;
        int var8 = this.field9346 * var7 >> 12;
        int var9 = -115 % ((-19 - arg2) / 35);
        return var8 > arg0 + arg1 && arg0 + arg1 > -var8;
    }
}
