import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 extends class160 {

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "Z")
    private boolean field543 = true;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Z")
    private boolean field532 = true;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "[I")
    public static int[] field533 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lch;")
    public static class290 field538 = null;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field536 = -1;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "Z")
    public static boolean field541 = false;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
    public static int field539 = 2;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "Lhc;")
    public static class235 field542;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field540;
        int[] var3 = super.field2488.method15((byte) 127, arg0);
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, this.field543 ? -arg0 + class53.field811 : arg0, (byte) 112);
            if (this.field532) {
                for (int var5 = 0; class240.field3896 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class189.field2929];
                }
            } else {
                class175.method1185(var4, 0, var3, 0, class240.field3896);
            }
        }
        if (arg1 != 57) {
            method275(-47, -34, (byte) -62, 84, -127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIBII)V")
    public static final void method275(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -111 % ((arg2 - 23) / 62);
        ++field534;
        class41 var6 = class221.method1492((byte) -42, arg3, 8);
        var6.method301(8792);
        var6.field583 = arg0;
        var6.field592 = arg4;
        var6.field584 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static void method276(int arg0) {
        field533 = null;
        field538 = null;
        field542 = null;
        if (arg0 != -1423742676) {
            method277(62, -72, -56, -20, -22, 48);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field535;
        int var6 = -arg5 + arg3;
        int var7 = -arg1 + arg4;
        int var8 = 36 / ((44 - arg2) / 54);
        if (~var6 != -1) {
            if (~var7 == -1) {
                class6.method64(arg0, arg1, (byte) -65, arg3, arg5);
            } else {
                int var9 = (var7 << 12) / var6;
                int var10 = -(arg5 * var9 >> 12) + arg1;
                int var11;
                int var12;
                if (arg3 >= class223.field3423) {
                    if (~class148.field2338 > ~arg3) {
                        var11 = class148.field2338;
                        var12 = (class148.field2338 * var9 >> 12) + var10;
                    } else {
                        var12 = arg4;
                        var11 = arg3;
                    }
                } else {
                    var11 = class223.field3423;
                    var12 = (class223.field3423 * var9 >> 12) + var10;
                }
                if (var12 < class90.field1568) {
                    var11 = (-var10 + class90.field1568 << 12) / var9;
                    var12 = class90.field1568;
                } else if (~var12 < ~class266.field4247) {
                    var11 = (-var10 + class266.field4247 << 12) / var9;
                    var12 = class266.field4247;
                }
                int var13;
                int var14;
                if (class223.field3423 > arg5) {
                    var13 = class223.field3423;
                    var14 = var10 - -(class223.field3423 * var9 >> 12);
                } else if (~arg5 < ~class148.field2338) {
                    var14 = (class148.field2338 * var9 >> 12) + var10;
                    var13 = class148.field2338;
                } else {
                    var14 = arg1;
                    var13 = arg5;
                }
                if (~var14 <= ~class90.field1568) {
                    if (~class266.field4247 > ~var14) {
                        var14 = class266.field4247;
                        var13 = (class266.field4247 - var10 << 12) / var9;
                    }
                } else {
                    var14 = class90.field1568;
                    var13 = (-var10 + class90.field1568 << 12) / var9;
                }
                class284.method1909(var13, arg0, -1, var11, var14, var12);
            }
        } else {
            if (var7 != 0) {
                class286.method1915(arg4, arg1, (byte) 41, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field537;
        if (!arg1) {
            field542 = null;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(this.field543 ? -arg0 + class53.field811 : arg0, 126, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field532) {
                for (int var11 = 0; ~class240.field3896 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class240.field3896; ++var12) {
                    var8[var12] = var5[-var12 + class189.field2929];
                    var9[var12] = var6[-var12 + class189.field2929];
                    var10[var12] = var7[-var12 + class189.field2929];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field531;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field2494 = arg0.method633(93) == 1;
                }
            } else {
                this.field543 = arg0.method633(71) == 1;
            }
        } else {
            this.field532 = arg0.method633(71) == 1;
        }
        if (arg1 <= 11) {
            field539 = 21;
        }
    }
}
