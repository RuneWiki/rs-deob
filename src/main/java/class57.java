import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class57 extends class156 {

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
    public static int field869 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIII)V")
    public static final void method412(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field863;
        class141.field2275.field3933 = 0;
        class141.field2275.method1538(193, (byte) 48);
        class141.field2275.method1538(arg3, (byte) 121);
        class141.field2275.method1538(arg1, (byte) -72);
        class141.field2275.method1534(0, arg4);
        class141.field2275.method1534(0, arg2);
        class8.field157 = 0;
        class123.field2011 = 0;
        class47.field743 = 1;
        if (arg0 < 3) {
            method412((byte) -117, 52, -35, -61, -104);
        }
        class234.field4075 = -3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILo;II)V")
    public static final void method413(int arg0, class175 arg1, int arg2, int arg3) {
        ++field866;
        if (class244.field4229 == null && !class33.field534) {
            if (arg1 != null && class16.method140(arg3 + -218659871, arg1) != null) {
                class244.field4229 = arg1;
                class242.field4213 = class16.method140(-218659743, arg1);
                class98.field1587 = arg2;
                if (arg3 != 128) {
                    field871 = 67;
                }
                class94.field1499 = false;
                class239.field4150 = arg0;
                class38.field582 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(III)Z")
    public static final boolean method414(int arg0, int arg1, int arg2) {
        int var3 = -25 % ((35 - arg2) / 47);
        ++field861;
        return (1 & arg1 >> arg0 + 1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
    public static final void method415(int arg0) {
        class190 var1 = class2.field57;
        synchronized (class2.field57) {
            if (arg0 < 21) {
                method412((byte) 50, 43, -123, 37, -2);
            }
            class148.field2475 = class229.field3926;
            ++class195.field3406;
            if (~class59.field894 > -1) {
                for (int var2 = 0; ~var2 > -113; ++var2) {
                    class68.field1095[var2] = false;
                }
                class59.field894 = class194.field3399;
            } else {
                while (class59.field894 != class194.field3399) {
                    int var3 = class198.field3445[class194.field3399];
                    class194.field3399 = class194.field3399 + 1 & 127;
                    if (var3 >= 0) {
                        class68.field1095[var3] = true;
                    } else {
                        class68.field1095[~var3] = false;
                    }
                }
            }
            class229.field3926 = class239.field4158;
        }
        ++field868;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILaf;IJ)Z")
    public static final boolean method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class77.method534(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
    public static final int method417(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 12884) {
            method417(108, -26, 32, -117);
        }
        int var4 = arg0 & 3;
        ++field867;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == -2) {
            return arg2;
        } else {
            return ~var4 == -3 ? -arg3 + 7 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        ++field870;
        class97.field1568.method1790(0);
        if (arg0 != -120) {
            field865 = 110;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field864;
        int[][] var3 = super.field3645.method1352(arg0, -115);
        if (super.field3645.field3477 && this.method1044(-122)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % super.field2611 * super.field2611;
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class26.field452; ++var8) {
                int var9 = super.field2612[var6 - -(var8 % super.field2604)];
                var7[var8] = class5.method43(4080, var9 << 4);
                var4[var8] = class5.method43(4080, var9 >> 4);
                var5[var8] = class5.method43(4080, var9 >> 12);
            }
        }
        if (arg1 != 16383) {
            field869 = 25;
        }
        return var3;
    }
}
