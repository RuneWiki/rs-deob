import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class260 {

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    private int field711 = 4096;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "[I")
    private int[] field707 = new int[3];

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field710 = 409;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    private int field712 = 4096;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    private int field719 = 4096;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "[I")
    public static int[] field717 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "Loh;")
    public static class263 field718 = class253.method1681(-123, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lfk;")
    public static class14 field714;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIIII)V")
    public static final void method185(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class255 var5 = (class255) class49.field1061.method1878(true); var5 != null; var5 = (class255) class49.field1061.method1881(127)) {
            class31.method203(arg0 + -80, arg3, arg1, var5, arg4, arg2);
        }
        ++field713;
        class255 var6 = (class255) class234.field4083.method1878(true);
        if (arg0 != -6) {
            field714 = null;
        }
        while (var6 != null) {
            byte var10 = 1;
            if (var6.field4443.field4687 != var6.field4443.field4652) {
                if (~var6.field4443.field4707 == ~var6.field4443.field4652) {
                    var10 = 2;
                }
            } else {
                var10 = 0;
            }
            if (var6.field4449 != var10) {
                int var11 = class48.method307(69, var6.field4443);
                if (var6.field4453 != var11) {
                    if (var6.field4434 != null) {
                        class43.field933.method1136(var6.field4434);
                        var6.field4434 = null;
                    }
                    var6.field4453 = var11;
                }
                var6.field4449 = var10;
            }
            var6.field4452 = var6.field4443.field4688;
            var6.field4437 = var6.field4443.field4688 + 64 * var6.field4443.method898(120);
            var6.field4447 = var6.field4443.field4705;
            var6.field4439 = var6.field4443.field4705 + var6.field4443.method898(arg0 + 60) * 64;
            class31.method203(-123, arg3, arg1, var6, arg4, arg2);
            var6 = (class255) class234.field4083.method1881(124);
        }
        for (class255 var7 = (class255) class232.field4057.method38(24172); var7 != null; var7 = (class255) class232.field4057.method36(73)) {
            byte var8 = 1;
            if (~var7.field4451.field4687 != ~var7.field4451.field4652) {
                if (~var7.field4451.field4707 == ~var7.field4451.field4652) {
                    var8 = 2;
                }
            } else {
                var8 = 0;
            }
            if (var7.field4449 != var8) {
                int var9 = class145.method959(var7.field4451, 106);
                if (~var7.field4453 != ~var9) {
                    if (var7.field4434 != null) {
                        class43.field933.method1136(var7.field4434);
                        var7.field4434 = null;
                    }
                    var7.field4453 = var9;
                }
                var7.field4449 = var8;
            }
            var7.field4452 = var7.field4451.field4688;
            var7.field4437 = var7.field4451.field4688 + 64 * var7.field4451.method898(arg0 ^ -67);
            var7.field4447 = var7.field4451.field4705;
            var7.field4439 = var7.field4451.field4705 - -(var7.field4451.method898(arg0 ^ -65) * 64);
            class31.method203(-77, arg3, arg1, var7, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field709;
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (arg1 != 5) {
            this.field711 = -17;
        }
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 120, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class49.field1052; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field707[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field710) {
                    var10[var11] = var12;
                    var8[var11] = var6[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field707[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field710) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field707[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field710 > ~var17) {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var10[var11] = this.field712 * var12 >> 12;
                            var8[var11] = this.field711 * var14 >> 12;
                            var9[var11] = this.field719 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
    public static final void method186(byte arg0) {
        ++field716;
        int var1 = class107.field2026.method408(class38.field864);
        for (int var2 = 0; ~var2 > ~class252.field4384; ++var2) {
            int var7 = class107.field2026.method408(class200.method1388(var2, false));
            if (var1 < var7) {
                var1 = var7;
            }
        }
        var1 += 8;
        int var3 = -56 % ((25 - arg0) / 56);
        int var4 = class252.field4384 * 15 - -21;
        int var5 = -(var1 / 2) + class122.field2269;
        if (~class138.field2558 > ~(var1 + var5)) {
            var5 = -var1 + class138.field2558;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class5.field95;
        if (~class143.field2616 > ~(var6 - -var4)) {
            var6 = -var4 + class143.field2616;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class59.field1223 != 1) {
            if (class57.field1173 == class122.field2269 && class5.field95 == class31.field777) {
                class134.field2455 = class252.field4384 * 15 + 22;
                class59.field1223 = 0;
                class2.field53 = true;
                class275.field4822 = var1;
                class55.field1162 = var6;
                class83.field1652 = var5;
            } else {
                class137.field2497 = class57.field1173;
                class46.field1004 = class31.field777;
                class59.field1223 = 1;
            }
        } else if (~class137.field2497 == ~class122.field2269 && ~class5.field95 == ~class46.field1004) {
            class83.field1652 = var5;
            class134.field2455 = class252.field4384 * 15 - -22;
            class59.field1223 = 0;
            class2.field53 = true;
            class55.field1162 = var6;
            class275.field4822 = var1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method187(int arg0) {
        field714 = null;
        if (arg0 >= 97) {
            field718 = null;
            field717 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field715;
        if (arg1 != 5701) {
            method186((byte) -5);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method1277((byte) -111);
                            this.field707[2] = class263.method1777(var5, 255) >> 12;
                            this.field707[0] = class263.method1777(16711680, var5) << 4;
                            this.field707[1] = class263.method1777(var5 >> 4, 4080);
                        }
                    } else {
                        this.field712 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field711 = arg2.method1294((byte) 3);
                }
            } else {
                this.field719 = arg2.method1294((byte) 3);
            }
        } else {
            this.field710 = arg2.method1294((byte) 3);
        }
    }
}
