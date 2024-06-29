import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class151 extends class154 {

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    private int field2537 = 4096;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    private int field2542 = 0;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    private int field2543 = 8192;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    private int field2541 = 2048;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    private int field2539 = 2048;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    private int field2538 = 12288;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field2533 = 0;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field2544 = 127;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lce;")
    public static class115 field2532;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)Z")
    private final boolean method1030(int arg0, boolean arg1, int arg2) {
        ++field2529;
        int var4 = (arg0 - arg2) * this.field2538 >> 12;
        int var5 = class43.field676[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2538;
        if (!arg1) {
            method1031(-51);
        }
        int var7 = (var6 << 12) / this.field2543;
        int var8 = this.field2537 * var7 >> 12;
        return ~(arg0 + arg2) > ~var8 && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field2545;
        if (arg0 != -9) {
            this.method1032(51, -85, 106);
        }
        class77.method527((byte) 121);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1031(int arg0) {
        if (arg0 != 5613) {
            field2532 = null;
        }
        field2532 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)Z")
    private final boolean method1032(int arg0, int arg1, int arg2) {
        if (arg1 > -52) {
            return true;
        } else {
            int var4 = (arg0 + arg2) * this.field2538 >> 12;
            ++field2530;
            int var5 = class43.field676[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field2538;
            int var7 = (var6 << 12) / this.field2543;
            int var8 = this.field2537 * var7 >> 12;
            return arg2 - arg0 < var8 && -arg0 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static final void method1033(boolean arg0) {
        ++field2531;
        if (!arg0) {
            if (class246.field4420 == 5) {
                class246.field4420 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILpe;IIIII)V")
    public static final void method1034(int arg0, class237 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 * arg6 - -(arg4 * arg4);
        ++field2535;
        if (~var7 >= -360001) {
            int var8 = -97 / ((28 - arg5) / 61);
            int var9 = Math.min(arg1.field4067 / 2, arg1.field4206 / 2);
            if (~var7 < ~(var9 * var9)) {
                var9 -= 10;
                int var10 = class279.field4933 + class25.field355 & 2047;
                int var11 = class76.field1192[var10];
                int var12 = class76.field1189[var10];
                int var13 = var12 * 256 / (class172.field2884 + 256);
                int var14 = var11 * 256 / (class172.field2884 - -256);
                int var15 = arg4 * var13 + -(arg6 * var14) >> 16;
                int var16 = arg4 * var14 - -(arg6 * var13) >> 16;
                double var17 = Math.atan2((double) var16, (double) var15);
                int var19 = (int) (Math.sin(var17) * (double) var9);
                int var20 = (int) (Math.cos(var17) * (double) var9);
                ((class195) class167.field2776[arg3]).method1071(arg2 - -(arg1.field4067 / 2) + var19 + -10, arg0 - -(arg1.field4206 / 2) - (var20 + 10), 20, 20, 15, 15, var17, 256);
            } else {
                class10.method56(class107.field1671[arg3], arg6, arg2, arg0, 256, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int var4 = class62.field1029[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class227.field3898; ++var5) {
                int var6 = class239.field4263[var5] + -2048;
                int var7 = this.field2539 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = var6 - -this.field2533;
                int var11 = this.field2541 + var4;
                int var12 = var10 >= -2048 ? var10 : var10 + 4096;
                int var13 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var14 = var11 >= -2048 ? var11 : var11 - -4096;
                int var15 = this.field2542 + var4;
                int var16 = ~var15 > 2047 ? var15 + 4096 : var15;
                int var17 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var18 = ~var16 >= -2049 ? var16 : var16 - 4096;
                var3[var5] = !this.method1030(var18, true, var9) && !this.method1032(var13, -105, var17) ? 0 : 4096;
            }
        }
        ++field2546;
        if (arg1 != 1075962732) {
            this.field2537 = 81;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field2543 = arg0.method1244(false);
                                    }
                                } else {
                                    this.field2537 = arg0.method1244(false);
                                }
                            } else {
                                this.field2538 = arg0.method1244(false);
                            }
                        } else {
                            this.field2541 = arg0.method1244(false);
                        }
                    } else {
                        this.field2533 = arg0.method1244(false);
                    }
                } else {
                    this.field2542 = arg0.method1244(false);
                }
            } else {
                this.field2539 = arg0.method1244(false);
            }
            ++field2540;
        }
    }
}
