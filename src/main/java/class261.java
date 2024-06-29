import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class261 extends class314 {

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public int field4660 = -1;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public int field4661 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4640 = 2301979;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lud;")
    private static class279 field4639 = class130.method1024("wave2:", 255);

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lud;")
    public static class279 field4642 = class130.method1024("rect_debug=", 255);

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lud;")
    public static class279 field4637 = field4639;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "J")
    public static long field4656 = 0L;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Lud;")
    public static class279 field4654 = field4639;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lok;")
    public static class149 field4638;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lok;")
    public static class149 field4653;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lcb;")
    public static class280 field4657;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1866(int arg0, byte arg1) {
        field4634++;
        class222.field3928.method1339(arg0, 19326);
        class173.field3125.method1339(arg0, 19326);
        class301.field5356.method1339(arg0, 19326);
        int var2 = 108 % ((arg1 + 28) / 33);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)I", line = 21)
    public static final int method1867(int arg0, boolean arg1) {
        field4659++;
        if (class202.field3603 != null) {
            class202.field3603.method2024(-1);
            class202.field3603 = null;
        }
        if (arg1) {
            field4640 = -5;
        }
        class39.field852++;
        if (class39.field852 > 4) {
            class39.field852 = 0;
            class173.field3121 = 0;
            return arg0;
        }
        class173.field3121 = 0;
        if (class247.field4386 == class117.field2134) {
            class117.field2134 = class202.field3606;
        } else {
            class117.field2134 = class247.field4386;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 54)
    public static void method1868(byte arg0) {
        field4637 = null;
        field4657 = null;
        field4638 = null;
        field4654 = null;
        if (arg0 == -101) {
            field4639 = null;
            field4642 = null;
            field4653 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BI)[B", line = 89)
    public static final byte[] method1869(byte[] arg0, int arg1) {
        field4649++;
        class53 var2 = new class53(arg0);
        if (arg1 < 40) {
            field4642 = (class279) null;
        }
        int var3 = var2.method483(-113);
        int var4 = var2.method453(1);
        if (var4 < 0 || class149.field2696 != 0 && class149.field2696 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method496(0, var4, var5, 3);
            return var5;
        } else {
            int var6 = var2.method453(1);
            if (var6 < 0 || !(class149.field2696 == 0 || var6 <= class149.field2696)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class234.method1691(var7, var6, arg0, var4, 9);
            } else {
                class292.field5205.method288(var7, -119, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)I", line = 171)
    public static final int method1870(int arg0) {
        if (arg0 > -43) {
            return -60;
        } else {
            field4636++;
            return class84.field1591.method1340(-20605);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIIB)V", line = 217)
    public static final void method1871(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4635++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class97.field1824) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class117.field2124 + ((class178.field3212 - class117.field2124) * var6 / 100);
            if (var7 < class190.field3427) {
                var7 = class190.field3427;
            } else if (class42.field888 < var7) {
                var7 = class42.field888;
            }
            int var8 = arg0 * var7 * 512 / (arg4 * 334);
            if (var8 < class240.field4220) {
                short var9 = class240.field4220;
                var7 = arg4 * 334 * var9 / (arg0 * 512);
                if (var7 > class42.field888) {
                    var7 = class42.field888;
                    int var10 = arg0 * 512 * var7 / (var9 * 334);
                    int var11 = (arg4 - var10) / 2;
                    if (arg1) {
                        class256.method1838();
                        class256.method1827(arg3, arg2, var11, arg0, 0);
                        class256.method1827(arg3 + arg4 - var11, arg2, var11, arg0, 0);
                    }
                    arg4 -= var11 * 2;
                    arg3 += var11;
                }
            } else if (var8 > class222.field3937) {
                short var12 = class222.field3937;
                var7 = arg4 * var12 * 334 / (arg0 * 512);
                if (class190.field3427 > var7) {
                    var7 = class190.field3427;
                    int var13 = arg4 * 334 * var12 / (var7 * 512);
                    int var14 = (arg0 - var13) / 2;
                    if (arg1) {
                        class256.method1838();
                        class256.method1827(arg3, arg2, arg4, var14, 0);
                        class256.method1827(arg3, arg2 + arg0 - var14, arg4, var14, 0);
                    }
                    arg2 += var14;
                    arg0 -= var14 * 2;
                }
            }
            class81.field1562 = arg0 * var7 / 334;
        }
        class44.field925 = arg3;
        class109.field2020 = arg2;
        class130.field2382 = (short) arg0;
        if (arg5 <= 90) {
            method1869((byte[]) null, -95);
        }
        class11.field363 = (short) arg4;
    }
}
