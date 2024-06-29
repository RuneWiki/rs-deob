import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class150 extends class99 {

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    private int field2699 = 4096;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    private int field2703 = 0;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "Lr;")
    public static class66 field2695 = class93.method641(43, "<col=ff9040>");

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Lr;")
    public static class66 field2693 = class93.method641(43, "rect_debug=");

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field2697 = 0;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "Lr;")
    public static class66 field2700 = class93.method641(43, "<)4col> x");

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    public static int field2704 = 1;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field2702 = -1;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "[I")
    public static int[] field2698;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class28.method158(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class230.method1504(var6 + 1, class30.field453[arg0][arg1][arg3] + arg5, var7 + 1) && class230.method1504(var6 + 128 - 1, class30.field453[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class230.method1504(var6 + 128 - 1, class30.field453[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class230.method1504(var6 + 1, class30.field453[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class145.field2649[arg0][var8][var14] == -class16.field204) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class30.field453[arg0][arg1][arg3] + arg5;
            if (!class230.method1504(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class230.method1504(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class230.method1504(var9, var11, var13)) {
                        return false;
                    } else if (!class230.method1504(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field2700 = null;
        field2693 = null;
        int var1 = 100 % ((arg0 - -80) / 46);
        field2698 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IZ)V")
    public static final void method1020(int arg0, boolean arg1) {
        class132.field2460.method1611(-18767, arg0);
        ++field2694;
        if (!arg1) {
            field2704 = 114;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        if (arg0 != -61) {
            this.method10((byte) 2, 80);
        }
        ++field2692;
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, arg1, arg0 ^ -29154);
            for (int var5 = 0; ~class199.field3432 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2703 && this.field2699 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static final void method1021(int arg0) {
        class174.field3066.method1614(111);
        ++field2696;
        if (arg0 != 7) {
            field2698 = null;
        }
        class209.field3626.method1614(arg0 + 108);
        class182.field3192.method1614(115);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2704 = 68;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2699 = arg0.method1674(1355769544);
            }
        } else {
            this.field2703 = arg0.method1674(1355769544);
        }
        ++field2691;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbe;ZZ)V")
    public static final void method1022(class75 arg0, boolean arg1, boolean arg2) {
        ++field2701;
        int var3 = arg0.field1492;
        if (!arg1) {
            field2702 = 98;
        }
        int var4 = (int) arg0.field1560;
        arg0.method560(-17554);
        if (arg2) {
            class157.method1073(-10, var3);
        }
        class36.method201(var3, 2);
        class63 var5 = class54.method367(var4, (byte) -80);
        if (var5 != null) {
            class215.method1385(var5, -124);
        }
        class176.field3105 = 0;
        class115.field2177 = false;
        class100.method689(class129.field2407, class70.field1405, class187.field3240, class9.field102, (byte) -107);
        if (field2702 != -1) {
            class244.method1607(116, field2702, 1);
        }
    }
}
