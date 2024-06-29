import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class367 extends class330 {

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    private int field5270 = 4096;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field5277 = 0;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field5274 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field5278 = 0;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Luia;")
    public static class589 field5275;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 3)
    public class367() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)[I", line = 8)
    public final int[] method464(int arg0, boolean arg1) {
        ++field5272;
        if (arg1) {
            this.method466((class511) null, -12, (byte) 14);
        }
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) 85);
            for (int var5 = 0; ~class80.field901 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field5277) {
                    if (~this.field5270 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field5270;
                    }
                } else {
                    var3[var5] = this.field5277;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V", line = 51)
    public static final void method2289(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        if (~arg2 > ~arg0) {
            int var5 = (arg2 - -arg0) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg0; ++var11) {
                if (~((long) (var10 & var11) + var7) < ~arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method2289(var6 + -1, 31439, arg2, arg3, arg4);
            method2289(arg0, 31439, var6 + 1, arg3, arg4);
        }
        if (arg1 != 31439) {
            field5274 = -39;
        }
        ++field5271;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I", line = 113)
    public final int[][] method537(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field5273;
            int[][] var3 = super.field4621.method1597(arg1, true);
            if (super.field4621.field3510) {
                int[][] var4 = this.method2082(arg1, 0, 127);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class80.field901 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field5277 <= var12) {
                        if (this.field5270 < var12) {
                            var8[var11] = this.field5270;
                        } else {
                            var8[var11] = var12;
                        }
                    } else {
                        var8[var11] = this.field5277;
                    }
                    if (~this.field5277 >= ~var13) {
                        if (~this.field5270 > ~var13) {
                            var9[var11] = this.field5270;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field5277;
                    }
                    if (~this.field5277 < ~var14) {
                        var10[var11] = this.field5277;
                    } else if (this.field5270 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field5270;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 195)
    public static final void method2290(int arg0) {
        ++field5280;
        class620 var1 = (class620) class297.field4326.method1041(1048832);
        boolean var2 = class81.field906 != null || class559.field7871 > 0;
        int var3 = var1.method1623(true);
        int var4 = var1.method1626(113);
        if (var2) {
            class114.field1375 = 1;
        }
        if (arg0 != -6169) {
            field5274 = -29;
        }
        if (!var2) {
            class49.method413(var4, (byte) 94, class99.field1151, var3);
        } else {
            class268.field3884 = class99.field1151;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V", line = 233)
    public static void method2291(byte arg0) {
        field5275 = null;
        if (arg0 != -73) {
            field5275 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lgga;IB)V", line = 246)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field5279;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4636 = arg0.method3013(20) == 1;
                }
            } else {
                this.field5270 = arg0.method3002(-1);
            }
        } else {
            this.field5277 = arg0.method3002(-1);
        }
        int var5 = 111 / ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 288)
    public static final void method2292(int arg0) {
        while (true) {
            if (class315.field4517.method2595(class179.field2258, arg0 ^ 91) >= 15) {
                int var1 = class315.field4517.method2591(-30, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class685 var3 = (class685) class450.field6288.method3669(false, (long) var1);
                    if (var3 == null) {
                        class359 var4 = new class359();
                        var4.field9186 = var1;
                        var3 = new class685(var4);
                        class450.field6288.method3666((byte) 65, (long) var1, var3);
                        class669.field9376[class744.field10275++] = var3;
                        var2 = true;
                    }
                    class359 var5 = var3.field9573;
                    class425.field5934[class429.field5988++] = var1;
                    var5.field9132 = class346.field5034;
                    if (var5.field5172 != null && var5.field5172.method3646(true)) {
                        class632.method3625((byte) -126, var5);
                    }
                    int var6 = class315.field4517.method2591(-30, 1);
                    if (~var6 == -2) {
                        class588.field8293[class701.field9773++] = var1;
                    }
                    int var7 = (class315.field4517.method2591(arg0 ^ -25, 3) - -4 & -1319108601) << 11;
                    int var8 = class315.field4517.method2591(-30, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = class315.field4517.method2591(arg0 + -35, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    int var10 = class315.field4517.method2591(-30, 1);
                    int var11 = class315.field4517.method2591(-30, 2);
                    var5.method2258(-98, class104.field1201.method4318(class315.field4517.method2591(-30, 14), arg0 + -202));
                    var5.method3742((byte) -102, var5.field5172.field8899);
                    var5.field9118 = var5.field5172.field8907 << 3;
                    if (var2) {
                        var5.method3746(16383, var7, true);
                    }
                    var5.method2259(class724.field10031.field9214[0] + var9, var5.method3744(1), false, class724.field10031.field9219[0] + var8, ~var10 == -2, var11);
                    if (var5.field5172.method3646(true)) {
                        class713.method4002(var5, (class286) null, var5.field9219[0], var5.field9214[0], (class723) null, 0, var5.field3467, false);
                    }
                    continue;
                }
            }
            if (arg0 != 5) {
                method2290(-8);
            }
            ++field5276;
            class315.field4517.method2596((byte) -33);
            return;
        }
    }
}
