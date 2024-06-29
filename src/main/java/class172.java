import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class172 extends class139 {

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    private int field2499 = 0;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    private int field2496 = 0;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    private int field2498 = 1;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "Lku;")
    public static class232 field2502 = new class232(4);

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "Lwf;")
    public static class79 field2503 = new class79(41, 3);

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "Lus;")
    public static class1 field2505 = new class1(38, -1);

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2501;
        if (~arg4 > ~(arg1 + arg3) && ~(arg2 + arg4) < ~arg3) {
            if (arg8 > -24) {
                method1063(-103, -56L);
            }
            return ~(arg0 + arg5) < ~arg6 && arg5 < arg6 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        class224.method1439(-97);
        ++field2500;
        if (arg0 != 7) {
            this.field2496 = 42;
        }
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        if (arg0 >= -45) {
            field2504 = -34;
        }
        field2503 = null;
        field2505 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field2494;
        if (arg1 != 27782) {
            return null;
        } else {
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                int var4 = class237.field3559[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class356.field5147; ++var6) {
                    int var7 = class216.field3245[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (this.field2496 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field2498 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field2498;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field2499 != -1) {
                        if (this.field2499 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class253.field3720[(var12 & 4088) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IJ)V")
    public static final void method1063(int arg0, long arg1) {
        ++field2495;
        if (arg0 != 11) {
            method1063(34, -88L);
        }
        int var3 = class492.field6935.field4331 - -class141.field1875;
        int var4 = class396.field5645 + class492.field6935.field4317;
        if (-var3 + class353.field5098 < -500 || ~(class353.field5098 - var3) < -501 || ~(-var4 + class480.field6734) > 499 || -var4 + class480.field6734 > 500) {
            class480.field6734 = var4;
            class353.field5098 = var3;
        }
        if (~class353.field5098 != ~var3) {
            int var5 = -class353.field5098 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (~var6 > ~var5) {
                    var6 = var5;
                }
            } else if (~var6 != -1) {
                if (~var6 < ~var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class353.field5098 += var6;
        }
        if (class480.field6734 != var4) {
            int var7 = -class480.field6734 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (~var8 == -1) {
                    var8 = 1;
                } else if (~var7 > ~var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (~var8 > ~var7) {
                var8 = var7;
            }
            class480.field6734 += var8;
        }
        if (!class314.field4438.field5782) {
            class483.field6806 += (float) arg1 * class342.field4991 / 6.0F;
            class157.field2346 += (float) arg1 * class111.field1413 / 6.0F;
        }
        class153.method963((byte) 91);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            method1061(8, -28, 102, 50, -52, 78, -100, 102, -92);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field2498 = arg0.method1701(arg1 ^ 23164);
                }
            } else {
                this.field2499 = arg0.method1701(-23121);
            }
        } else {
            this.field2496 = arg0.method1701(-23121);
        }
        ++field2493;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
    public static final void method1064(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 320) {
            method1064(28, 4, 43, -108);
        }
        ++field2497;
        class489 var4 = class116.method731(-625541408, 11, arg3);
        var4.method2863(255);
        var4.field6892 = arg2;
        var4.field6895 = arg1;
    }
}
