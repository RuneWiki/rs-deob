import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class209 extends class117 {

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    private int field3787 = 1;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    private int field3786 = 0;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    private int field3792 = 0;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "[I")
    public static int[] field3790 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!e", name = "W", descriptor = "[Z")
    public static boolean[] field3788 = new boolean[8];

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[[S")
    public static short[][] field3794 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lvb;")
    public static class67 field3791 = new class67();

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "[J")
    public static long[] field3796 = new long[256];

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "Lhh;")
    public static class163 field3797;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            method1501(4);
        }
        ++field3783;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class143.field2702 < ~var6; ++var6) {
                int var7 = class26.field402[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field3792 == 0) {
                    var9 = (-var4 + var7) * this.field3787;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3787 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field3786 != 0) {
                    if (this.field3786 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class46.field775[(4089 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILgj;II)V")
    public static final void method1500(int arg0, class126 arg1, int arg2, int arg3) {
        ++field3784;
        if ((arg2 & 8) != 0) {
            int var4 = class33.field502.method619(-70);
            byte[] var5 = new byte[var4];
            class81 var6 = new class81(var5);
            class33.field502.method649(var5, 858135392, 0, var4);
            class228.field4116[arg0] = var6;
            arg1.method1000(var6, true);
        }
        if (~(128 & arg2) != -1) {
            int var7 = class33.field502.method629((byte) -112);
            if (~var7 == -65536) {
                var7 = -1;
            }
            int var8 = class33.field502.method622(true);
            class100.method811(arg3 + 16620, var7, arg1, var8);
        }
        if ((arg2 & 64) != 0) {
            int var9 = class33.field502.method629((byte) -121);
            int var10 = class33.field502.method622(true);
            int var11 = class33.field502.method619(arg3 ^ 16573);
            int var12 = class33.field502.field1541;
            boolean var13 = (var9 & 32768) != 0;
            if (arg1.field2424 != null && arg1.field2444 != null) {
                long var14 = arg1.field2424.method1193((byte) 40);
                boolean var16 = false;
                if (var10 <= 1) {
                    if (var13 || class97.field1837 != 1 && field3789 != 1) {
                        for (int var17 = 0; var17 < class29.field465; ++var17) {
                            if (~class116.field2207[var17] == ~var14) {
                                var16 = true;
                                break;
                            }
                        }
                    } else {
                        var16 = true;
                    }
                }
                if (!var16 && class45.field760 == 0) {
                    class30.field472.field1541 = 0;
                    class33.field502.method623(0, class30.field472.field1562, var11, 127);
                    class30.field472.field1541 = 0;
                    int var18 = -1;
                    class163 var20;
                    if (var13) {
                        var9 &= 32767;
                        class186 var19 = class77.method564(false, class30.field472);
                        var18 = var19.field3415;
                        var20 = var19.field3413.method1632(false, class30.field472);
                    } else {
                        var20 = class79.method582(class2.method23(class30.field472, (byte) 100).method1200((byte) -65));
                    }
                    arg1.field3623 = var20.method1194(1);
                    arg1.field3624 = var9 & 255;
                    arg1.field3681 = 150;
                    arg1.field3643 = var9 >> 8;
                    if (var10 != 2) {
                        if (var10 != 1) {
                            class260.method1758(var20, var18, arg1.method997(arg3 ^ -16615), false, var13 ? 17 : 2, (class163) null);
                        } else {
                            class260.method1758(var20, var18, class145.method1101(0, new class163[] { class183.field3362, arg1.method997(arg3 + 16631) }), false, !var13 ? 1 : 17, (class163) null);
                        }
                    } else {
                        class260.method1758(var20, var18, class145.method1101(arg3 + 16621, new class163[] { class152.field2852, arg1.method997(10) }), false, var13 ? 17 : 1, (class163) null);
                    }
                }
            }
            class33.field502.field1541 = var12 - -var11;
        }
        if ((16 & arg2) != 0) {
            arg1.field3618 = class33.field502.method614((byte) -127);
            if (arg1.field3618 == 65535) {
                arg1.field3618 = -1;
            }
        }
        if ((arg2 & 1024) != 0) {
            arg1.field3671 = class33.field502.method658(104);
            int var21 = class33.field502.method603(arg3 + 16620);
            arg1.field3657 = (var21 & 65535) + class227.field4092;
            arg1.field3630 = 0;
            arg1.field3649 = var21 >> 16;
            if (~arg1.field3671 == -65536) {
                arg1.field3671 = -1;
            }
            if (arg1.field3657 > class227.field4092) {
                arg1.field3630 = -1;
            }
            arg1.field3636 = 0;
        }
        if (~(4 & arg2) != -1) {
            arg1.field3634 = class33.field502.method614((byte) -127);
            arg1.field3680 = class33.field502.method611(true);
        }
        if ((512 & arg2) != 0) {
            int var22 = class33.field502.method619(-94);
            int var23 = class33.field502.method609((byte) 118);
            arg1.method1443(var22, class227.field4092, (byte) -96, var23);
        }
        if (arg3 != -16621) {
            field3797 = null;
        }
        if (~(arg2 & 32) != -1) {
            int var24 = class33.field502.method609((byte) 118);
            int var25 = class33.field502.method609((byte) 118);
            arg1.method1443(var24, class227.field4092, (byte) 120, var25);
            arg1.field3621 = class227.field4092 - -300;
            arg1.field3669 = class33.field502.method622(true);
        }
        if ((1 & arg2) != 0) {
            arg1.field3623 = class33.field502.method605(true);
            if (~arg1.field3623.method1213(arg3 ^ -16621, 0) == -127) {
                arg1.field3623 = arg1.field3623.method1216(1, (byte) -125);
                class56.method396(arg1.field3623, arg3 + 16723, arg1.method997(10), 2);
            } else if (class235.field4203 == arg1) {
                class56.method396(arg1.field3623, 90, arg1.method997(10), 2);
            }
            arg1.field3624 = 0;
            arg1.field3681 = 150;
            arg1.field3643 = 0;
        }
        if (~(256 & arg2) != -1) {
            arg1.field3662 = class33.field502.method609((byte) 118);
            arg1.field3672 = class33.field502.method619(arg3 + 16698);
            arg1.field3627 = class33.field502.method619(88);
            arg1.field3678 = class33.field502.method619(arg3 ^ -16521);
            arg1.field3639 = class33.field502.method658(-74) + class227.field4092;
            arg1.field3641 = class33.field502.method611(true) - -class227.field4092;
            arg1.field3642 = class33.field502.method619(arg3 ^ -16543);
            arg1.field3617 = 0;
            arg1.field3653 = 1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field3787 = arg2.method622(true);
                }
            } else {
                this.field3786 = arg2.method622(true);
            }
        } else {
            this.field3792 = arg2.method622(true);
        }
        if (arg0 != 0) {
            this.method57((byte) -54);
        }
        ++field3785;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static void method1501(int arg0) {
        field3796 = null;
        field3791 = null;
        if (arg0 != 30775) {
            field3790 = null;
        }
        field3788 = null;
        field3790 = null;
        field3797 = null;
        field3794 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class209() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        class223.method1578(true);
        ++field3795;
        if (arg0 > -92) {
            method1501(-127);
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field3796[var0] = var1;
        }
        field3797 = class137.method1065("blinken1:", 17);
    }
}
