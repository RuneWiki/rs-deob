import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class269 extends class436 {

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    private int field3667 = 4096;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    private int field3666 = 0;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    private int field3669 = 16;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    private int field3668 = 2000;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    private int field3676 = 0;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "[I")
    public static int[] field3671 = new int[4096];

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field3667 = arg2.method2403((byte) 100);
                        }
                    } else {
                        this.field3666 = arg2.method2403((byte) 107);
                    }
                } else {
                    this.field3669 = arg2.method2429(arg0 ^ 34);
                }
            } else {
                this.field3668 = arg2.method2403((byte) 101);
            }
        } else {
            this.field3676 = arg2.method2429(arg0 ^ 34);
        }
        if (arg0 != 34) {
            method1657((byte) 0);
        }
        ++field3673;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != -14) {
            method1657((byte) -124);
        }
        ++field3674;
        class105.method721(false);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lab;")
    public static final class399 method1655(int arg0, int arg1, int arg2) {
        if (arg2 >= -5) {
            return null;
        } else {
            ++field3672;
            class399 var3 = (class399) class307.field4207.method1412((byte) -54, (long) arg1 | (long) arg0 << 32);
            if (var3 == null) {
                var3 = new class399(arg0, arg1);
                class307.field4207.method1419(var3.field5363, 57, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            return null;
        } else {
            ++field3670;
            int[] var3 = super.field6258.method2688((byte) -101, arg0);
            if (super.field6258.field6138) {
                int var4 = this.field3667 >> 1;
                int[][] var5 = super.field6258.method2687(arg1 ^ 18338);
                Random var6 = new Random((long) this.field3676);
                for (int var7 = 0; ~this.field3668 < ~var7; ++var7) {
                    int var8 = this.field3667 <= 0 ? this.field3666 : this.field3666 + -var4 + class99.method704(var6, this.field3667, (byte) -10);
                    int var9 = (4084 & var8) >> 4;
                    int var10 = class99.method704(var6, class43.field653, (byte) -10);
                    int var11 = class99.method704(var6, class123.field1728, (byte) -10);
                    int var12 = (class288.field3991[var9] * this.field3669 >> 12) + var10;
                    int var13 = (class441.field6396[var9] * this.field3669 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = var12 - var10;
                    if (~var15 != -1 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var12 < var10) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class99.method704(var6, 4096, (byte) -10) >> 2) + 1024;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 <= ~var13 ? -1 : 1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            int var29 = (-var10 + var28) * var25 + 1024 + var26;
                            int var30 = var28 & class278.field3758;
                            int var31 = class190.field2634 & var21;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (var24 > 0) {
                                var24 += -var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
    public static void method1656(byte arg0) {
        field3671 = null;
        int var1 = 56 % ((arg0 - 1) / 41);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(B)V")
    public static final void method1657(byte arg0) {
        ++field3675;
        if (~class230.field3089 != 0) {
            int var1 = class349.field4883;
            int var2 = class162.field2269;
            if (class383.field5452 != 0) {
                var2 = class361.field5073;
                var1 = class349.field4879;
            }
            class45.method320(var2, (byte) 68, class243.field3359, class230.field3089, 0, 0, class194.field2696, var1, 0, 0);
            if (class245.field3389 != null) {
                class352.method2280(var1, -24410, var2);
            }
            int var3 = -123 / ((arg0 - -10) / 60);
        }
    }
}
