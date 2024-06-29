import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class122 extends class747 {

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    private int field1616 = 0;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    private int field1618 = 0;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    private int field1608 = 0;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "Ljn;")
    public static class324 field1609 = new class324(14, 0, 4, 1);

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method754(int arg0) {
        if (arg0 != 966364684) {
            field1619 = 57;
        }
        field1609 = null;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static final void method755(int arg0) {
        ++class533.field7400;
        ++field1607;
        if (arg0 <= -46) {
            class583 var1 = class54.method400(class213.field2800, (byte) -51, class61.field885);
            var1.field7963.method444(class710.method3997(3), 128);
            var1.field7963.method492(-2, class118.field1561);
            var1.field7963.method492(-2, class553.field7716);
            var1.field7963.method444(class332.field4707.field4773.method2791(0), 128);
            class463.method2838(var1, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBII)V")
    private final void method756(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 10 % ((arg1 - -65) / 44);
        ++field1605;
        int var6 = arg2 > 2048 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (arg0 + 4096) * arg2 >> 12;
        if (~var6 < -1) {
            int var7 = arg3 * 6;
            int var8 = arg2 + arg2 + -var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var6;
            if (~var10 == -1) {
                this.field1610 = var8;
                this.field1620 = var6;
                this.field1614 = var15;
                return;
            }
            if (var10 == 1) {
                this.field1610 = var8;
                this.field1620 = var16;
                this.field1614 = var6;
                return;
            }
            if (~var10 == -3) {
                this.field1614 = var6;
                this.field1610 = var15;
                this.field1620 = var8;
                return;
            }
            if (~var10 == -4) {
                this.field1614 = var16;
                this.field1620 = var8;
                this.field1610 = var6;
                return;
            }
            if (var10 == 4) {
                this.field1614 = var8;
                this.field1610 = var6;
                this.field1620 = var15;
                return;
            }
            if (var10 == 5) {
                this.field1614 = var8;
                this.field1610 = var16;
                this.field1620 = var6;
                return;
            }
        } else {
            this.field1620 = this.field1614 = this.field1610 = arg2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
    private final void method757(int arg0, int arg1, int arg2, int arg3) {
        ++field1621;
        int var5 = ~arg0 < ~arg1 ? arg0 : arg1;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = arg1 <= arg0 ? arg1 : arg0;
        int var8 = ~arg3 <= ~var7 ? var7 : arg3;
        if (arg2 > -87) {
            this.method756(88, (byte) 93, 46, -62);
        }
        int var9 = var6 - var8;
        this.field1612 = (var8 - -var6) / 2;
        if (~var9 >= -1) {
            this.field1606 = 0;
        } else {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field1606 = ~arg1 == ~var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg1 == ~var6) {
                this.field1606 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field1606 = arg0 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field1606 /= 6;
        }
        if (this.field1612 > 0 && this.field1612 < 4096) {
            this.field1623 = (var9 << 12) / (this.field1612 > 2048 ? -(this.field1612 * 2) + 8192 : this.field1612 * 2);
        } else {
            this.field1623 = 0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)Lhe;")
    public static final class577 method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1611;
        long var7 = (long) arg6 * 76724863L ^ (long) arg4 * 986053L ^ (long) arg0 * 475427L ^ (long) arg3 * 67481L ^ (long) arg5 * 97549L ^ (long) arg2 * 32147369L;
        class577 var9 = (class577) class679.field9434.method3898((byte) -42, var7);
        if (var9 != null) {
            return var9;
        } else {
            class577 var10 = class453.field6283.method1547(arg3, arg5, arg0, arg4, arg2, arg6);
            class679.field9434.method3899(112, var10, var7);
            if (arg1 != 19585) {
                field1619 = -55;
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field1613;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1616 = (arg0.method491(false) << 12) / 100;
                }
            } else {
                this.field1618 = (arg0.method491(false) << 12) / 100;
            }
        } else {
            this.field1608 = arg0.method496(-127);
        }
        if (arg1 != 11608) {
            method760();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldc;I)V")
    public static final void method759(class63 arg0, int arg1) {
        ++field1615;
        if (arg0.field954.length + -arg0.field956 >= 1) {
            int var2 = arg0.method505((byte) -119);
            if (~var2 <= -1 && var2 <= 1) {
                if (~(arg0.field954.length + -arg0.field956) <= -3) {
                    int var3 = arg0.method482(-772591672);
                    if (arg1 == -4097) {
                        if (var3 * 6 <= arg0.field954.length + -arg0.field956) {
                            for (int var4 = 0; var3 > var4; ++var4) {
                                int var5 = arg0.method482(arg1 ^ 772587575);
                                int var6 = arg0.method457(-14532);
                                if (~var5 > ~class621.field8315.length && class693.field9627[var5] && (class501.field6986.method3097(var5, (byte) 67).field98 != '1' || ~var6 <= 0 && var6 <= 1)) {
                                    class621.field8315[var5] = var6;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public static final void method760() {
        for (int var0 = 0; var0 < class280.field4069.length; ++var0) {
            class280.field4069[var0].method637();
        }
        class280.field4069 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field1622;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var4 = this.method4158(0, arg1, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class73.field1095 > var11; ++var11) {
                this.method757(var5[var11], var6[var11], -110, var7[var11]);
                this.field1623 += this.field1618;
                this.field1606 += this.field1608;
                this.field1612 += this.field1616;
                while (this.field1606 < 0) {
                    this.field1606 += 4096;
                }
                while (~this.field1606 < -4097) {
                    this.field1606 -= 4096;
                }
                if (this.field1623 < 0) {
                    this.field1623 = 0;
                }
                if (this.field1612 < 0) {
                    this.field1612 = 0;
                }
                if (~this.field1623 < -4097) {
                    this.field1623 = 4096;
                }
                if (this.field1612 > 4096) {
                    this.field1612 = 4096;
                }
                this.method756(this.field1623, (byte) 125, this.field1612, this.field1606);
                var8[var11] = this.field1620;
                var9[var11] = this.field1614;
                var10[var11] = this.field1610;
            }
        }
        int var12 = 99 % ((arg0 - 35) / 58);
        return var3;
    }
}
