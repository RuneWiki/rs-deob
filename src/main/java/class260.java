import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class260 extends class89 {

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field4529 = 4096;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    private int field4533 = 4096;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "[I")
    private int[] field4528 = new int[3];

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    private int field4531 = 409;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    private int field4527 = 4096;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lej;")
    public static class188 field4538 = new class188(128);

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lha;")
    private static class46 field4540 = class271.method1828("Please remove ", -46);

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "Lha;")
    public static class46 field4539 = field4540;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lha;")
    public static class46 field4542 = field4540;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "[I")
    public static int[] field4541;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class260() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBI)V")
    public static final void method1740(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4534;
        class135.field2445 = arg2;
        class70.field1205 = arg4;
        class73.field1309 = arg0;
        class4.field70 = arg1;
        if (arg3 != 63) {
            method1742(-128);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4536;
        if (arg1 != 25) {
            return null;
        } else {
            int[][] var3 = super.field1695.method843((byte) -25, arg0);
            if (super.field1695.field2028) {
                int[][] var4 = this.method689((byte) 95, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field4528[0];
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var13 > this.field4531) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field4528[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var15 > this.field4531) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field4528[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (var17 > this.field4531) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field4529 * var12 >> 12;
                                var9[var11] = this.field4533 * var14 >> 12;
                                var10[var11] = this.field4527 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4530;
        if (arg3 != 31489) {
            method1742(-47);
        }
        int var6 = -arg4 + arg5;
        int var7 = -arg1 + arg2;
        if (~var6 == -1) {
            if (var7 != 0) {
                class43.method282(arg1, true, arg2, arg0, arg4);
            }
        } else if (var7 == 0) {
            class40.method274(arg1, 4, arg4, arg0, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (~class135.field2445 >= ~arg5) {
                if (~arg5 < ~class73.field1309) {
                    var10 = class73.field1309;
                    var11 = (class73.field1309 * var8 >> 12) + var9;
                } else {
                    var10 = arg5;
                    var11 = arg2;
                }
            } else {
                var11 = (class135.field2445 * var8 >> 12) + var9;
                var10 = class135.field2445;
            }
            int var12;
            int var13;
            if (~class135.field2445 >= ~arg4) {
                if (~class73.field1309 > ~arg4) {
                    var12 = class73.field1309;
                    var13 = (class73.field1309 * var8 >> 12) + var9;
                } else {
                    var12 = arg4;
                    var13 = arg1;
                }
            } else {
                var13 = (class135.field2445 * var8 >> 12) + var9;
                var12 = class135.field2445;
            }
            if (var13 >= class4.field70) {
                if (~var13 < ~class70.field1205) {
                    var13 = class70.field1205;
                    var12 = (-var9 + class70.field1205 << 12) / var8;
                }
            } else {
                var13 = class4.field70;
                var12 = (-var9 + class4.field70 << 12) / var8;
            }
            if (class4.field70 > var11) {
                var11 = class4.field70;
                var10 = (-var9 + class4.field70 << 12) / var8;
            } else if (~class70.field1205 > ~var11) {
                var11 = class70.field1205;
                var10 = (-var9 + class70.field1205 << 12) / var8;
            }
            class32.method210(var11, arg0, false, var10, var12, var13);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            method1741(-13, -90, 53, -111, -96, -7);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method559(-1);
                            this.field4528[0] = class50.method369(267386880, var5 << 4);
                            this.field4528[1] = class50.method369(var5 >> 4, 4080);
                            this.field4528[2] = class50.method369(var5 >> 12, 0);
                        }
                    } else {
                        this.field4529 = arg0.method545((byte) 104);
                    }
                } else {
                    this.field4533 = arg0.method545((byte) 51);
                }
            } else {
                this.field4527 = arg0.method545((byte) 126);
            }
        } else {
            this.field4531 = arg0.method545((byte) 77);
        }
        ++field4537;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method1742(int arg0) {
        field4539 = null;
        field4542 = null;
        if (arg0 != -26950) {
            method1741(27, 0, -115, 32, -112, 59);
        }
        field4538 = null;
        field4540 = null;
        field4541 = null;
    }
}
