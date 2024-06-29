import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class56 extends class4 {

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "J")
    public static long field748 = 0L;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "[Lss;")
    private class400[] field743;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[[I)V")
    private final void method306(int arg0, int[][] arg1) {
        if (arg0 != -30338) {
            this.method13(-5, (class551) null, -117);
        }
        ++field749;
        int var3 = class132.field1627;
        int var4 = class620.field8925;
        class166.method898(arg1, 10596);
        class618.method3543(0, class376.field5248, 0, class150.field1971, 0);
        if (this.field743 != null) {
            for (int var5 = 0; var5 < this.field743.length; ++var5) {
                class400 var6 = this.field743[var5];
                int var7 = var6.field5478;
                int var8 = var6.field5481;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method1098(var4, var3, (byte) -81);
                    }
                } else if (~var8 > -1) {
                    var6.method1096(var3, var4, -18);
                } else {
                    var6.method1099(var4, 4095, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBIII)V")
    public static final void method307(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field747;
        int var6 = -arg0 + arg4;
        int var7 = -97 / ((-10 - arg2) / 32);
        int var8 = -arg1 + arg3;
        if (~var6 == -1) {
            if (~var8 != -1) {
                class103.method566(arg0, -87, arg5, arg1, arg3);
            }
        } else if (~var8 == -1) {
            class371.method2266(arg1, 41, arg5, arg4, arg0);
        } else {
            int var9 = (var8 << 12) / var6;
            int var10 = -(arg0 * var9 >> 12) + arg1;
            int var11;
            int var12;
            if (class594.field8575 > arg4) {
                var11 = class594.field8575;
                var12 = (class594.field8575 * var9 >> 12) + var10;
            } else if (arg4 > class355.field4972) {
                var12 = (class355.field4972 * var9 >> 12) + var10;
                var11 = class355.field4972;
            } else {
                var12 = arg3;
                var11 = arg4;
            }
            int var13;
            int var14;
            if (class594.field8575 <= arg0) {
                if (arg0 <= class355.field4972) {
                    var13 = arg1;
                    var14 = arg0;
                } else {
                    var13 = var10 - -(class355.field4972 * var9 >> 12);
                    var14 = class355.field4972;
                }
            } else {
                var13 = var10 - -(class594.field8575 * var9 >> 12);
                var14 = class594.field8575;
            }
            if (var13 < class535.field7467) {
                var14 = (-var10 + class535.field7467 << 12) / var9;
                var13 = class535.field7467;
            } else if (var13 > class113.field1453) {
                var14 = (-var10 + class113.field1453 << 12) / var9;
                var13 = class113.field1453;
            }
            if (~var12 > ~class535.field7467) {
                var11 = (class535.field7467 - var10 << 12) / var9;
                var12 = class535.field7467;
            } else if (var12 > class113.field1453) {
                var12 = class113.field1453;
                var11 = (-var10 + class113.field1453 << 12) / var9;
            }
            class536.method2987(arg5, var11, var14, true, var12, var13);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Lbda;")
    public static final class401 method308(int arg0, int arg1) {
        ++field750;
        class401[] var2 = class613.method3501((byte) -16);
        for (int var3 = arg1; ~var3 > ~var2.length; ++var3) {
            class401 var4 = var2[var3];
            if (var4.field5484 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field744;
        if (~arg2 == -1) {
            this.field743 = new class400[arg1.method3045(-128)];
            for (int var4 = 0; ~var4 > ~this.field743.length; ++var4) {
                int var5 = arg1.method3045(-128);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field743[var4] = class374.method2281((byte) 37, arg1);
                            }
                        } else {
                            this.field743[var4] = class148.method808(arg1, true);
                        }
                    } else {
                        this.field743[var4] = class49.method271(arg1, 103);
                    }
                } else {
                    this.field743[var4] = class609.method3484(-3236, arg1);
                }
            }
        } else if (arg2 == 1) {
            super.field44 = arg1.method3045(-127) == 1;
        }
        if (arg0 > -89) {
            field748 = -100L;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 >= -83) {
            return null;
        } else {
            ++field745;
            int[][] var3 = super.field38.method3021((byte) 89, arg0);
            if (super.field38.field7618) {
                int var4 = class132.field1627;
                int var5 = class620.field8925;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field38.method3019((byte) -55);
                this.method306(-30338, var6);
                for (int var8 = 0; class620.field8925 > var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class132.field1627; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class143.method783(var15, 255) << 4;
                        var12[var14] = class143.method783(var15 >> 4, 4080);
                        var11[var14] = class143.method783(var15 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field746;
        if (arg0 != 10) {
            method307(-25, -125, (byte) 1, -82, 44, 7);
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            this.method306(arg0 + -30348, super.field31.method2255((byte) -110));
        }
        return var3;
    }
}
