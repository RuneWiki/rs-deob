import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class243 extends class17 {

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
    private int field3531 = 4096;

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
    private int field3534 = 0;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "Ltn;")
    public static class60 field3524 = new class60(23, 7);

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
    public static int field3527 = -1;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ws", name = "N", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ws", name = "Q", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field205 = ~arg0.method2357((byte) 120) == -2;
                }
            } else {
                this.field3531 = arg0.method2338(0);
            }
        } else {
            this.field3534 = arg0.method2338(0);
        }
        if (arg2 != 5159) {
            this.method34((class403) null, -19, 37);
        }
        ++field3525;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIB)V")
    public static final void method1527(int arg0, int arg1, byte arg2) {
        ++field3529;
        int var3 = class113.field1536.method2430(class362.field5170.method3116(class149.field1979, (byte) 123), (byte) -126);
        for (class214 var4 = (class214) class363.field5190.method2655(15152); var4 != null; var4 = (class214) class363.field5190.method2660((byte) 67)) {
            int var9 = class531.method3118(0, var4);
            if (~var9 < ~var3) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var5 = class37.field408 * 16 - -21;
        int var6 = arg0 - var3 / 2;
        if (~(var6 - -var3) < ~class147.field1956) {
            var6 = class147.field1956 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (~(var5 + arg1) < ~class273.field4048) {
            var7 = -var5 + class273.field4048;
        }
        class123.field1679 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class2.field56 = (class328.field4784 ? 26 : 22) + class37.field408 * 16;
        class388.field5445 = var3;
        class424.field5977 = true;
        int var8 = -124 / ((arg2 - 3) / 36);
        class250.field3725 = var7;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)Lrm;")
    public static final class286 method1528(byte arg0) {
        ++field3535;
        try {
            int var1 = -122 % ((arg0 - 77) / 38);
            return (class286) Class.forName("oh").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field3533;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            field3524 = null;
        }
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            for (int var5 = 0; class530.field7763 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field3534) {
                    if (var6 <= this.field3531) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3531;
                    }
                } else {
                    var3[var5] = this.field3534;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Loi;Z)V")
    public static final void method1529(class53 arg0, boolean arg1) {
        ++field3532;
        class260.field3848 = arg0;
        if (!arg1) {
            field3524 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "(I)V")
    public static void method1530(int arg0) {
        if (arg0 == 6196) {
            field3524 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(III)Z")
    public static final boolean method1531(int arg0, int arg1, int arg2) {
        int var3 = 46 / ((arg2 - -29) / 34);
        ++field3526;
        return class220.method1364(arg0, (byte) -3, arg1) | ~(arg0 & 458752) != -1 || class508.method3031(arg1, arg0, (byte) -2);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -25) {
            return null;
        } else {
            ++field3530;
            int[][] var3 = super.field201.method1851(arg0, (byte) -56);
            if (super.field201.field4431) {
                int[][] var4 = this.method91(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class530.field7763; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field3534 >= ~var12) {
                        if (~this.field3531 > ~var12) {
                            var8[var11] = this.field3531;
                        } else {
                            var8[var11] = var12;
                        }
                    } else {
                        var8[var11] = this.field3534;
                    }
                    if (~this.field3534 < ~var13) {
                        var9[var11] = this.field3534;
                    } else if (this.field3531 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field3531;
                    }
                    if (this.field3534 > var14) {
                        var10[var11] = this.field3534;
                    } else if (var14 > this.field3531) {
                        var10[var11] = this.field3531;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(III)I")
    public static final int method1532(int arg0, int arg1, int arg2) {
        ++field3528;
        int var3 = arg2 >>> 24;
        int var4 = ((arg0 & arg2) * var3 & 16711680 | -16711936 & (16711935 & arg2) * var3) >>> 8;
        int var5 = -var3 + 255;
        return ((-16711936 & (16711935 & arg1) * var5 | 16711680 & (arg1 & 65280) * var5) >>> 8) + var4;
    }
}
