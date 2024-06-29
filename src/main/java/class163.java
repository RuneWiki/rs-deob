import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class163 extends class109 {

    @OriginalMember(owner = "client!q", name = "Kb", descriptor = "[S")
    public static short[] field2682 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!q", name = "Ob", descriptor = "Leg;")
    private static class37 field2686 = class174.method1167("Discard", 90);

    @OriginalMember(owner = "client!q", name = "Nb", descriptor = "I")
    public static int field2685 = 0;

    @OriginalMember(owner = "client!q", name = "Sb", descriptor = "I")
    public static int field2690 = 0;

    @OriginalMember(owner = "client!q", name = "Ub", descriptor = "[I")
    public static int[] field2692 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!q", name = "ac", descriptor = "Leg;")
    public static class37 field2698 = field2686;

    @OriginalMember(owner = "client!q", name = "Jb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!q", name = "Lb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!q", name = "Mb", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!q", name = "Pb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!q", name = "Qb", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!q", name = "Vb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!q", name = "Wb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!q", name = "Xb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!q", name = "Yb", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!q", name = "Zb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!q", name = "Rb", descriptor = "Llc;")
    public static class251 field2689;

    @OriginalMember(owner = "client!q", name = "Tb", descriptor = "Lih;")
    public class275 field2691;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2692 = null;
        field2698 = null;
        field2686 = null;
        if (arg0 <= 15) {
            method1092(53);
        }
        field2689 = null;
        field2682 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static final void method1093(boolean arg0) {
        class77.field1198.method1403(45);
        if (arg0) {
            ++field2695;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        ++field2684;
        if (this.field2691 != null) {
            class2 var13 = ~super.field1800 != 0 && ~super.field1785 == -1 ? class186.method1242(0, super.field1800) : null;
            class2 var14 = ~super.field1789 == 0 || ~super.field1789 == ~super.field1767 && var13 != null ? null : class186.method1242(0, super.field1789);
            class253 var15 = this.field2691.method1850(super.field1771, 0, var14, super.field1792, var13);
            if (var15 != null) {
                super.field1762 = var15.method308();
                class275 var16 = this.field2691;
                if (var16.field4888 != null) {
                    var16 = var16.method1854((byte) 68);
                }
                if (class232.field4013 && var16.field4856) {
                    class253 var17 = class167.method1122(this.field2691.field4874, var15, var14 != null ? var14 : var13, false, this.field2691.field4854, super.field1799, var14 == null ? super.field1771 : super.field1792, super.field1793, this.field2691.field4827, arg0, this.field2691.field4839, this.field2691.field4873, super.field1820, super.field1822);
                    var17.method313(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field1826);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (this.field2691.field4831 != 0 || ~this.field2691.field4875 != -1) {
                    int var21 = class76.field1192[arg0];
                    int var22 = class76.field1189[arg0];
                    short var23 = this.field2691.field4875;
                    short var24 = this.field2691.field4831;
                    int var25 = -var24 / 2;
                    int var26 = -var23 / 2;
                    int var27 = var21 * var26 + var22 * var25 >> 16;
                    int var28 = var22 * var26 + -(var21 * var25) >> 16;
                    int var29 = -var23 / 2;
                    int var30 = var24 / 2;
                    int var31 = var21 * var29 + var22 * var30 >> 16;
                    int var32 = var22 * var29 + -(var21 * var30) >> 16;
                    int var33 = -var24 / 2;
                    int var34 = class262.method1768(class237.field4140, super.field1799 + var27, super.field1793 + var28, (byte) -98);
                    int var35 = class262.method1768(class237.field4140, super.field1799 - -var31, super.field1793 + var32, (byte) -128);
                    int var36 = var23 / 2;
                    int var37 = var21 * var36 + var22 * var33 >> 16;
                    int var38 = var22 * var36 + -(var21 * var33) >> 16;
                    int var39 = class262.method1768(class237.field4140, super.field1799 + var37, super.field1793 + var38, (byte) -109);
                    int var40 = var23 / 2;
                    int var41 = var24 / 2;
                    int var42 = var21 * var40 + var22 * var41 >> 16;
                    int var43 = var22 * var40 + -(var21 * var41) >> 16;
                    int var44 = class262.method1768(class237.field4140, super.field1799 + var42, super.field1793 - -var43, (byte) -94);
                    int var45 = ~var44 >= ~var35 ? var44 : var35;
                    int var46 = ~var35 >= ~var34 ? var35 : var34;
                    int var47 = ~var44 < ~var39 ? var39 : var44;
                    if (var23 != 0) {
                        var18 = (int) (Math.atan2((double) (-var47 + var46), (double) var23) * 325.95D) & 2047;
                        if (~var18 != -1) {
                            var15.method1467(var18);
                        }
                    }
                    int var48 = var39 <= var34 ? var39 : var34;
                    int var49 = var34 + var44;
                    if (var35 + var39 < var49) {
                        var49 = var35 + var39;
                    }
                    if (var24 != 0) {
                        var19 = (int) (Math.atan2((double) (var48 - var45), (double) var24) * 325.95D) & 2047;
                        if (~var19 != -1) {
                            var15.method1459(var19);
                        }
                    }
                    var20 = (var49 >> 1) - super.field1822;
                    if (~var20 != -1) {
                        var15.method1457(0, var20, 0);
                    }
                }
                class253 var50 = null;
                if (super.field1814 != -1 && ~super.field1773 != 0) {
                    class231 var51 = class79.method536(-13, super.field1814);
                    var50 = var51.method1593(super.field1773, -28023);
                    if (var50 != null) {
                        var50.method1457(0, -super.field1811, 0);
                        if (var51.field3958) {
                            if (var18 != 0) {
                                var50.method1467(var18);
                            }
                            if (~var19 != -1) {
                                var50.method1459(var19);
                            }
                            if (var20 != 0) {
                                var50.method1457(0, var20, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class209) var15).method1447(var50);
                }
                this.method765(var15, 10114);
                if (this.field2691.field4839 == 1) {
                    var15.field4511 = true;
                }
                var15.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1826);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILih;)V")
    public final void method1094(int arg0, class275 arg1) {
        this.field2691 = arg1;
        ++field2687;
        if (super.field1826 != null) {
            super.field1826.method1335();
        }
        if (arg0 > -76) {
            this.method308();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)Z")
    public final boolean method767(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field2694;
            return this.field2691 != null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2696;
        if (this.field2691 != null) {
            if (!super.field1833) {
                class2 var6 = super.field1800 != -1 && super.field1785 == 0 ? class186.method1242(0, super.field1800) : null;
                class2 var7 = ~super.field1789 == 0 || super.field1789 == super.field1767 && var6 != null ? null : class186.method1242(0, super.field1789);
                class253 var8 = this.field2691.method1850(super.field1771, 0, var7, super.field1792, var6);
                if (var8 == null) {
                    return;
                }
                this.method765(var8, 10114);
            }
            if (super.field1826 != null) {
                super.field1826.method1332(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)I")
    public static final int method1095(int arg0, int arg1) {
        ++field2693;
        if (~arg1 > -1) {
            return 0;
        } else {
            class100 var2 = (class100) class166.field2750.method992((byte) 125, (long) arg1);
            if (var2 == null) {
                return class285.method1913((byte) -101, arg1).field4757;
            } else {
                int var3 = 61 % ((arg0 - -49) / 57);
                int var4 = 0;
                for (int var5 = 0; var5 < var2.field1552.length; ++var5) {
                    if (~var2.field1552[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + class285.method1913((byte) -102, arg1).field4757 + -var2.field1552.length;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()I")
    public final int method308() {
        ++field2681;
        return super.field1762;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Leg;")
    public static final class37 method1096(int arg0, byte arg1) {
        if (arg1 != -35) {
            field2690 = 65;
        }
        ++field2688;
        return class43.method282(arg0, 10, false, (byte) 117);
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2697;
        if (super.field1826 != null) {
            super.field1826.method1338();
        }
    }
}
