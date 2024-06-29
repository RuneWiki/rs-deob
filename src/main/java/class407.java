import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class407 extends class667 {

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    private int field5666 = 0;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    private int field5668 = 4096;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private int field5667 = 16;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    private int field5669 = 0;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    private int field5675 = 2000;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Lvt;")
    public static class303 field5670 = null;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field5674 = 1403;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "Lnj;")
    public static class244 field5672 = new class244();

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "Leq;")
    public static class209 field5678;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Z")
    public static boolean field5673;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        class458.method2798(true);
        ++field5677;
        if (arg0) {
            method2496(true);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field5671;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 > -87) {
            method2497(91, 21, 118, 15, -95, -104);
        }
        if (super.field9355.field3728) {
            int var4 = this.field5668 >> 1;
            int[][] var5 = super.field9355.method1746((byte) 118);
            Random var6 = new Random((long) this.field5669);
            for (int var7 = 0; var7 < this.field5675; ++var7) {
                int var8 = this.field5668 > 0 ? this.field5666 - (-class459.method2800(var6, this.field5668, (byte) -91) + var4) : this.field5666;
                int var9 = 255 & var8 >> 4;
                int var10 = class459.method2800(var6, class77.field1455, (byte) -68);
                int var11 = class459.method2800(var6, class694.field9758, (byte) -44);
                int var12 = (class265.field3861[var9] * this.field5667 >> 12) + var10;
                int var13 = (class491.field7002[var9] * this.field5667 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class459.method2800(var6, 4096, (byte) -92) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = var28 & class439.field6131;
                        int var31 = var21 & class77.field1453;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
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

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field5668 = arg0.method253(-13900);
                        }
                    } else {
                        this.field5666 = arg0.method253(-13900);
                    }
                } else {
                    this.field5667 = arg0.method273(255);
                }
            } else {
                this.field5675 = arg0.method253(-13900);
            }
        } else {
            this.field5669 = arg0.method273(255);
        }
        if (arg1 != 3) {
            field5670 = null;
        }
        ++field5676;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(Z)V")
    public static void method2496(boolean arg0) {
        field5678 = null;
        if (arg0) {
            field5674 = 90;
        }
        field5672 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class407() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)V")
    public static final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class748.field10458 <= ~arg3 && ~class558.field7940 >= ~arg2) {
            boolean var6;
            if (~class156.field2337 < ~arg5) {
                var6 = false;
                arg5 = class156.field2337;
            } else if (~arg5 >= ~class612.field8854) {
                var6 = true;
            } else {
                arg5 = class612.field8854;
                var6 = false;
            }
            boolean var7;
            if (class156.field2337 > arg1) {
                var7 = false;
                arg1 = class156.field2337;
            } else if (class612.field8854 < arg1) {
                var7 = false;
                arg1 = class612.field8854;
            } else {
                var7 = true;
            }
            if (~class558.field7940 < ~arg3) {
                arg3 = class558.field7940;
            } else {
                class399.method2472(27113, arg5, arg1, arg4, class329.field4651[arg3++]);
            }
            if (arg2 <= class748.field10458) {
                class399.method2472(27113, arg5, arg1, arg4, class329.field4651[arg2--]);
            } else {
                arg2 = class748.field10458;
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg2; ++var8) {
                    int[] var9 = class329.field4651[var8];
                    var9[arg5] = var9[arg1] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg3; arg2 >= var10; ++var10) {
                    class329.field4651[var10][arg5] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg2; ++var11) {
                    class329.field4651[var11][arg1] = arg4;
                }
            }
        }
        ++field5665;
        if (arg0 != 0) {
            field5672 = null;
        }
    }
}
