import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class573 extends class325 {

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Ltm;")
    public static class412 field7696 = new class412();

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "[Lida;")
    private class249[] field7699;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
    public static final int method3204(int arg0, int arg1, int arg2, int arg3) {
        ++field7693;
        if (arg2 != 124915076) {
            return -116;
        } else if (arg0 < arg1) {
            return arg1;
        } else {
            return ~arg0 >= ~arg3 ? arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4738 = ~arg0.method2398(-1372747256) == -2;
            }
        } else {
            this.field7699 = new class249[arg0.method2398(-1372747256)];
            for (int var4 = 0; this.field7699.length > var4; ++var4) {
                int var5 = arg0.method2398(-1372747256);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field7699[var4] = class265.method1739((byte) -88, arg0);
                            }
                        } else {
                            this.field7699[var4] = class192.method1325(arg0, 0);
                        }
                    } else {
                        this.field7699[var4] = class163.method1184(arg0, (byte) 102);
                    }
                } else {
                    this.field7699[var4] = class314.method1979(arg0, -1);
                }
            }
        }
        ++field7697;
        if (arg2 > -41) {
            field7696 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
    public static final void method3205(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class712.field9959.field1303.method3352(19) * arg1 >> 8;
        int var5 = 104 % ((46 - arg0) / 32);
        ++field7700;
        if (arg3 == -1 && !class645.field8963) {
            class583.method3245(0);
        } else if (arg3 != -1 && (~class757.field10503 != ~arg3 || !class274.method1784(122)) && var4 != 0 && !class645.field8963) {
            class49.method373(0, false, arg2, class177.field2367, var4, -118, arg3);
            class237.method1532(0);
        }
        if (~class757.field10503 != ~arg3) {
            class476.field6616 = null;
        }
        class757.field10503 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field7695;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            this.method3207(super.field4727.method2602(0), -82);
        }
        return arg0 <= 21 ? null : var3;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class573() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method3206(int arg0) {
        field7696 = null;
        if (arg0 != -3) {
            field7696 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([[II)V")
    private final void method3207(int[][] arg0, int arg1) {
        ++field7694;
        if (arg1 > -69) {
            this.field7699 = null;
        }
        int var3 = class261.field3874;
        int var4 = class657.field9077;
        class747.method4130(arg0, (byte) -110);
        class122.method998(0, class625.field8423, 0, class566.field7574, 0);
        if (this.field7699 != null) {
            for (int var5 = 0; this.field7699.length > var5; ++var5) {
                class249 var6 = this.field7699[var5];
                int var7 = var6.field3694;
                int var8 = var6.field3689;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method843((byte) 101, var4, var3);
                    }
                } else if (var8 < 0) {
                    var6.method844(var3, var4, -7895);
                } else {
                    var6.method845((byte) 85, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method360(int arg0, byte arg1) {
        ++field7698;
        if (arg1 != -9) {
            return null;
        } else {
            int[][] var3 = super.field4733.method1251((byte) 78, arg0);
            if (super.field4733.field2369) {
                int var4 = class261.field3874;
                int var5 = class657.field9077;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field4733.method1249((byte) -126);
                this.method3207(var6, arg1 + -76);
                for (int var8 = 0; ~class657.field9077 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class261.field3874 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class440.method2643(4080, var15 << 4);
                        var12[var14] = class440.method2643(65280, var15) >> 4;
                        var11[var14] = class440.method2643(16711680, var15) >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
