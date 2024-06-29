import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class571 extends class384 {

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "Z")
    private boolean field7960 = false;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "Z")
    private boolean field7965;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "[Lsq;")
    private class207[] field7961;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "Z")
    public static boolean field7966 = true;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
    public static boolean field7967 = true;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "Lan;")
    public static class182 field7962 = new class182(10, 8);

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        super.field5337.method3711(false, arg0);
        if (arg1 != 80) {
            field7962 = null;
        }
        ++field7959;
        super.field5337.method3781(-3, arg2);
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public static void method3210(int arg0) {
        if (arg0 != 1) {
            method3211(79, -123, -124);
        }
        field7962 = null;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        if (arg0 <= 78) {
            this.field7965 = true;
        }
        ++field7963;
        return true;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        ++field7964;
        if (this.field7960) {
            super.field5337.method3723(true, 1);
            super.field5337.method3711(false, this.field7961[arg0 + -1]);
            super.field5337.method3723(true, 0);
        }
        if (arg1 != 102) {
            field7967 = true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lbm;)V")
    public class571(class684 arg0) {
        super(arg0);
        if (arg0.field9612) {
            this.field7965 = arg0.field9592 < 3;
            int var2 = !this.field7965 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field7961 = new class207[3];
            this.field7961[0] = super.field5337.method1429(64, false, var4, false);
            this.field7961[1] = super.field5337.method1429(64, false, var5, false);
            this.field7961[2] = super.field5337.method1429(64, false, var3, false);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        if (arg0 != 4) {
            method3210(-29);
        }
        super.field5337.method3708(101, class409.field5765, class155.field1901);
        ++field7955;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        ++field7957;
        if (!this.field7960) {
            super.field5337.method3713(class632.field8774, 0, (byte) -47);
        } else {
            super.field5337.method3723(true, 1);
            super.field5337.method3711(false, (class329) null);
            super.field5337.method1428(class188.field2468, (byte) -43);
            super.field5337.method3734((byte) -14);
            if (this.field7965) {
                super.field5337.method3708(85, class155.field1901, class155.field1901);
                super.field5337.method3777(false, 0, class632.field8774);
                super.field5337.method3713(class632.field8774, 0, (byte) -53);
            } else {
                super.field5337.method3708(97, class155.field1901, class155.field1901);
                super.field5337.method3777(false, 0, class632.field8774);
                super.field5337.method3723(true, 2);
                super.field5337.method3708(97, class155.field1901, class155.field1901);
                super.field5337.method3777(false, 0, class632.field8774);
                super.field5337.method3777(false, 1, class155.field1970);
                super.field5337.method3713(class632.field8774, 0, (byte) -54);
                super.field5337.method3711(false, (class329) null);
            }
            super.field5337.method3723(true, 0);
            this.field7960 = false;
        }
        if (arg0 == -60) {
            super.field5337.method3708(122, class155.field1901, class155.field1901);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
    public static final boolean method3211(int arg0, int arg1, int arg2) {
        ++field7958;
        int var3 = -108 % ((-4 - arg0) / 52);
        return ~(arg2 & 458752) != -1 | class137.method853(-1, arg2, arg1) || class10.method45(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(B)I")
    public static final int method3212(byte arg0) {
        if (arg0 < 54) {
            method3210(3);
        }
        ++field7956;
        int var1 = class147.field1776.method1319(true);
        if (class340.field4393.length + -1 > var1) {
            class147.field1776 = class340.field4393[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 <= 23) {
            this.method1015((class329) null, (byte) -15, -12);
        }
        ++field7968;
        if (this.field7961 != null && arg0) {
            super.field5337.method3723(true, 1);
            super.field5337.method1428(class537.field7542, (byte) -43);
            class462 var3 = super.field5337.method3729(1);
            var3.method1964(1024);
            super.field5337.method3771(0, class211.field2697);
            if (this.field7965) {
                super.field5337.method3708(87, class409.field5765, class235.field3034);
                super.field5337.method1395(false, 0, true, -117, class632.field8774);
                super.field5337.method3713(class222.field2913, 0, (byte) 124);
            } else {
                super.field5337.method3708(104, class155.field1901, class409.field5765);
                super.field5337.method3777(false, 0, class155.field1970);
                super.field5337.method3723(true, 2);
                super.field5337.method3708(118, class409.field5765, class235.field3034);
                super.field5337.method3777(false, 0, class155.field1970);
                super.field5337.method1395(false, 1, true, -72, class155.field1970);
                super.field5337.method3713(class222.field2913, 0, (byte) 110);
                super.field5337.method3711(false, super.field5337.field9593);
            }
            super.field5337.method3723(true, 0);
            this.field7960 = true;
        } else {
            super.field5337.method3713(class222.field2913, 0, (byte) 118);
        }
    }
}
