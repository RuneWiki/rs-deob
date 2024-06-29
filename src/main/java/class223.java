import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class223 extends class243 {

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    private int field3781 = 0;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    private int field3784 = 0;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    private int field3789 = 0;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field3780 = -1;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Ljava/lang/Object;")
    public static Object field3777 = new Object();

    @OriginalMember(owner = "client!mf", name = "sb", descriptor = "Lub;")
    private static class227 field3792 = class257.method1749("Allocating memory", 17263);

    @OriginalMember(owner = "client!mf", name = "rb", descriptor = "Lub;")
    public static class227 field3791 = field3792;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "Lbc;")
    public static class201 field3790 = new class201(16);

    @OriginalMember(owner = "client!mf", name = "tb", descriptor = "S")
    public static short field3793 = 256;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3789 = (arg0.method1428(arg1) << 12) / 100;
                }
            } else {
                this.field3781 = (arg0.method1428(false) << 12) / 100;
            }
        } else {
            this.field3784 = arg0.method1433(111);
        }
        if (arg1) {
            method1407(-24, 92);
        }
        ++field3773;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Lub;")
    public static final class227 method1407(int arg0, int arg1) {
        ++field3787;
        class227 var2 = new class227();
        var2.field3955 = new byte[arg0];
        var2.field3915 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)V")
    private final void method1408(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 108 % ((-16 - arg3) / 43);
        ++field3775;
        int var6 = ~arg0 < ~arg2 ? arg0 : arg2;
        int var7 = ~arg2 < ~arg0 ? arg0 : arg2;
        int var8 = var7 <= arg1 ? var7 : arg1;
        int var9 = ~var6 > ~arg1 ? arg1 : var6;
        this.field3783 = (var8 + var9) / 2;
        int var10 = -var8 + var9;
        if (var10 <= 0) {
            this.field3776 = 0;
        } else {
            int var11 = (-arg0 + var9 << 12) / var10;
            int var12 = (-arg2 + var9 << 12) / var10;
            int var13 = (-arg1 + var9 << 12) / var10;
            if (~arg0 != ~var9) {
                if (~arg2 == ~var9) {
                    this.field3776 = arg1 != var8 ? -var13 + 12288 : 4096 - -var11;
                } else {
                    this.field3776 = ~arg0 != ~var8 ? 20480 - var11 : var12 + 12288;
                }
            } else {
                this.field3776 = ~arg2 == ~var8 ? var13 + 20480 : 4096 - var12;
            }
            this.field3776 /= 6;
        }
        if (this.field3783 > 0 && ~this.field3783 > -4097) {
            this.field3782 = (var10 << 12) / (~this.field3783 >= -2049 ? this.field3783 * 2 : -(this.field3783 * 2) + 8192);
        } else {
            this.field3782 = 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            this.field3789 = -19;
        }
        ++field3778;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[][] var4 = this.method1616(arg0 + -231, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class212.field3586; ++var11) {
                this.method1408(var5[var11], var8[var11], var6[var11], (byte) -78);
                this.field3782 += this.field3781;
                this.field3783 += this.field3789;
                if (~this.field3782 > -1) {
                    this.field3782 = 0;
                }
                if (~this.field3782 < -4097) {
                    this.field3782 = 4096;
                }
                this.field3776 += this.field3784;
                if (this.field3783 < 0) {
                    this.field3783 = 0;
                }
                while (~this.field3776 > -1) {
                    this.field3776 += 4096;
                }
                while (~this.field3776 < -4097) {
                    this.field3776 -= 4096;
                }
                if (~this.field3783 < -4097) {
                    this.field3783 = 4096;
                }
                this.method1409(this.field3776, 2, this.field3782, this.field3783);
                var7[var11] = this.field3786;
                var9[var11] = this.field3788;
                var10[var11] = this.field3785;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIII)V")
    private final void method1409(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg3 >= -2049 ? (arg2 + 4096) * arg3 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        ++field3779;
        if (arg1 != 2) {
            field3790 = null;
        }
        if (var5 <= 0) {
            this.field3786 = this.field3788 = this.field3785 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = var6 >> 12;
            int var9 = -(var8 << 12) + var6;
            int var10 = (-var7 + var5 << 12) / var5;
            int var12 = var10 * var5 >> 12;
            int var13 = var9 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var8 != -1) {
                if (var8 != 1) {
                    if (~var8 != -3) {
                        if (var8 != 3) {
                            if (var8 != 4) {
                                if (var8 == 5) {
                                    this.field3786 = var5;
                                    this.field3788 = var7;
                                    this.field3785 = var15;
                                }
                            } else {
                                this.field3788 = var7;
                                this.field3785 = var5;
                                this.field3786 = var14;
                            }
                        } else {
                            this.field3788 = var15;
                            this.field3785 = var5;
                            this.field3786 = var7;
                        }
                    } else {
                        this.field3788 = var5;
                        this.field3786 = var7;
                        this.field3785 = var14;
                    }
                } else {
                    this.field3788 = var5;
                    this.field3785 = var7;
                    this.field3786 = var15;
                }
            } else {
                this.field3785 = var7;
                this.field3786 = var5;
                this.field3788 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static final void method1410(int arg0) {
        ++field3774;
        class166 var1 = (class166) class41.field673.method1277(78);
        int var2 = 56 % ((-65 - arg0) / 41);
        while (var1 != null) {
            class220 var3 = var1.field2777;
            if (~class64.field1171 == ~var3.field3710 && ~class253.field4393 >= ~var3.field3702) {
                if (class253.field4393 >= var3.field3700) {
                    if (~var3.field3703 < -1) {
                        class195 var4 = class220.field3715[var3.field3703 + -1];
                        if (var4 != null && var4.field50 >= 0 && var4.field50 < 13312 && var4.field99 >= 0 && ~var4.field99 > -13313) {
                            var3.method1391(var4.field99, class253.field4393, class193.method1227(var4.field50, true, var3.field3710, var4.field99) - var3.field3708, -1, var4.field50);
                        }
                    }
                    if (var3.field3703 < 0) {
                        int var5 = -var3.field3703 - 1;
                        class225 var6;
                        if (class254.field4473 == var5) {
                            var6 = class216.field3639;
                        } else {
                            var6 = class27.field446[var5];
                        }
                        if (var6 != null && ~var6.field50 <= -1 && ~var6.field50 > -13313 && ~var6.field99 <= -1 && ~var6.field99 > -13313) {
                            var3.method1391(var6.field99, class253.field4393, class193.method1227(var6.field50, true, var3.field3710, var6.field99) - var3.field3708, -1, var6.field50);
                        }
                    }
                    var3.method1390(-26945, class85.field1481);
                    class167.method1030(class64.field1171, (int) var3.field3705, (int) var3.field3737, (int) var3.field3693, 60, var3, var3.field3730, -1L, false);
                }
            } else {
                var1.method369(125);
            }
            var1 = (class166) class41.field673.method1271(250);
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
    public static void method1411(int arg0) {
        if (arg0 > 125) {
            field3792 = null;
            field3790 = null;
            field3791 = null;
            field3777 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)Lej;")
    public static final class5 method1412(int arg0, boolean arg1) {
        ++field3772;
        class5 var2 = (class5) class225.field3817.method1037(45, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class88.field1530.method884(arg0, 96, 5);
            class5 var4 = new class5();
            if (var3 != null) {
                var4.method21(new class226(var3), arg1);
            }
            class225.field3817.method1032(-810, var4, (long) arg0);
            if (arg1) {
                method1407(26, 93);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class223() {
        super(1, false);
    }
}
