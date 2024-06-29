import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class385 extends class739 {

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    private int field5565 = 0;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    private int field5568 = 4096;

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
    private int field5574 = 2000;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    private int field5567 = 0;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
    private int field5577 = 16;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "Lgr;")
    public static class530 field5569 = new class530(19, 8);

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    public static int field5576 = 2;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "D")
    public static double field5572;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lsl;IB)V", line = 4)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field5568 = arg0.method2882(arg2 + -2);
                        }
                    } else {
                        this.field5565 = arg0.method2882(-1);
                    }
                } else {
                    this.field5577 = arg0.method2886(true);
                }
            } else {
                this.field5574 = arg0.method2882(-1);
            }
        } else {
            this.field5567 = arg0.method2886(true);
        }
        ++field5570;
        if (arg2 != 1) {
            method2373(-67);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZI)[I", line = 69)
    public final int[] method445(boolean arg0, int arg1) {
        ++field5571;
        if (arg0) {
            field5572 = -1.4196104708086816D;
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = this.field5568 >> 1;
            int[][] var5 = super.field10317.method1041((byte) 56);
            Random var6 = new Random((long) this.field5567);
            for (int var7 = 0; ~var7 > ~this.field5574; ++var7) {
                int var8 = ~this.field5568 < -1 ? this.field5565 + class151.method1094(var6, 4, this.field5568) + -var4 : this.field5565;
                int var9 = (4084 & var8) >> 4;
                int var10 = class151.method1094(var6, 4, class399.field5703);
                int var11 = class151.method1094(var6, 4, class505.field7350);
                int var12 = (class195.field2853[var9] * this.field5577 >> 12) + var10;
                int var13 = (class624.field8880[var9] * this.field5577 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class151.method1094(var6, 4, 4096) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + (var26 - -1024);
                        int var30 = class423.field6029 & var28;
                        int var31 = var21 & class311.field4223;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V", line = 397)
    public class385() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V", line = 208)
    public static void method2373(int arg0) {
        field5569 = null;
        if (arg0 != 32686) {
            method2374(false, -114, (class571) null);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZILgt;)V", line = 221)
    public static final void method2374(boolean arg0, int arg1, class571 arg2) {
        ++field5575;
        if (class456.field6499 < 400) {
            class521 var3 = arg2.field8235;
            if (var3.field7535 != null) {
                var3 = var3.method3166(class226.field3372, true);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field7541) {
                String var4 = var3.field7536;
                if (var3.field7544 != 0) {
                    String var5 = class528.field7683 != class48.field790 ? class608.field8648.method3543(-24350, class45.field748) : class608.field8650.method3543(-24350, class45.field748);
                    var4 = var4 + class19.method93((byte) -105, var3.field7544, class108.field1536.field9069) + " (" + var5 + var3.field7544 + ")";
                }
                if (class549.field7997 && !arg0) {
                    class167 var6 = class76.field1107 != -1 ? class332.field4513.method1901(arg1 ^ 4114, class76.field1107) : null;
                    if (~(2 & class538.field7820) != -1 && (var6 == null || ~var3.method3163(var6.field2364, class76.field1107, true) != ~var6.field2364)) {
                        class145.method1016(class297.field4060, true, 0, false, class377.field5459 + " -> <col=ffff00>" + var4, -123, 0, (long) arg2.field4592, class243.field3582, (long) arg2.field4592, 13, -1, false);
                        ++class738.field10307;
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field7549;
                    if (class259.field3705) {
                        var7 = class357.method2268((byte) 86, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (~var3.field7554 == -1 || !var7[var8].equalsIgnoreCase(class608.field8643.method3543(-24350, class45.field748)))) {
                                byte var9 = 0;
                                int var10 = class474.field6744;
                                if (var8 == 0) {
                                    var9 = 19;
                                }
                                if (var8 == 1) {
                                    var9 = 20;
                                }
                                if (~var8 == -3) {
                                    var9 = 12;
                                }
                                if (~var8 == -4) {
                                    var9 = 49;
                                }
                                if (var3.field7514 == var8) {
                                    var10 = var3.field7573;
                                }
                                if (~var8 == -5) {
                                    var9 = 59;
                                }
                                if (~var3.field7513 == ~var8) {
                                    var10 = var3.field7582;
                                }
                                ++class365.field5342;
                                class145.method1016(var7[var8], true, 0, false, "<col=ffff00>" + var4, -125, 0, (long) arg2.field4592, var7[var8].equalsIgnoreCase(class608.field8643.method3543(-24350, class45.field748)) ? var3.field7562 : var10, (long) arg2.field4592, var9, -1, false);
                            }
                        }
                    }
                    if (var3.field7554 == 1 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class608.field8643.method3543(-24350, class45.field748))) {
                                short var12 = 0;
                                if (~class108.field1536.field9069 > ~var3.field7544) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 19;
                                }
                                if (~var11 == -2) {
                                    var13 = 20;
                                }
                                if (var11 == 2) {
                                    var13 = 12;
                                }
                                if (var11 == 3) {
                                    var13 = 49;
                                }
                                if (var11 == 4) {
                                    var13 = 59;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                class145.method1016(var7[var11], true, 0, false, "<col=ffff00>" + var4, -127, 0, (long) arg2.field4592, var3.field7562, (long) arg2.field4592, var13, -1, false);
                                ++class334.field4524;
                            }
                        }
                    }
                }
                class145.method1016(class608.field8642.method3543(-24350, class45.field748), true, 0, false, "<col=ffff00>" + var4, -117, 0, (long) arg2.field4592, class730.field10241, (long) arg2.field4592, 1004, arg1, arg0);
                ++class56.field962;
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V", line = 382)
    public final void method628(int arg0) {
        if (arg0 > 53) {
            class451.method2765(8);
            ++field5573;
        }
    }
}
