import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 extends class69 {

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[I")
    public static int[] field1935 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[I")
    public static int[] field1925 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
    public static final boolean method806(int arg0, int arg1) {
        ++field1933;
        if (arg1 != 31616) {
            method807((class177) null, (byte) 68);
        }
        return ~arg0 <= -98 && ~arg0 >= -123 || ~arg0 <= -66 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lhg;B)V")
    public static final void method807(class177 arg0, byte arg1) {
        ++field1921;
        if (arg1 <= 106) {
            field1935 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        ++field1932;
        int var4 = this.field1930 * arg2 >> 12;
        int var5 = this.field1924 * arg0 >> 12;
        int var6 = this.field1922 * arg2 >> 12;
        if (arg1 <= -64) {
            int var7 = this.field1927 * arg0 >> 12;
            class235.method1605(var4, var6, super.field1254, var7, true, var5);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)V")
    public final void method467(byte arg0, int arg1, int arg2) {
        ++field1926;
        int var4 = -82 / ((15 - arg0) / 49);
        int var5 = this.field1930 * arg2 >> 12;
        int var6 = this.field1922 * arg2 >> 12;
        int var7 = this.field1927 * arg1 >> 12;
        int var8 = this.field1924 * arg1 >> 12;
        class82.method574(var5, var6, super.field1253, super.field1255, var7, super.field1254, var8, true);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
    public final void method470(int arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            method808(34);
        }
        ++field1923;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
    public static final boolean method808(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field1928;
            try {
                if (class120.field2138 == 2) {
                    if (class40.field621 == null) {
                        class40.field621 = class132.method967(class66.field1213, class72.field1298, class110.field1882);
                        if (class40.field621 == null) {
                            return false;
                        }
                    }
                    if (class186.field3438 == null) {
                        class186.field3438 = new class111(class203.field3653, class254.field4605);
                    }
                    if (class234.field4175.method826(class186.field3438, class66.field1209, class40.field621, 22050, (byte) 121)) {
                        class234.field4175.method837(-128);
                        class234.field4175.method839(class16.field227, -21204);
                        class234.field4175.method844(105, class40.field621, class119.field2123);
                        class186.field3438 = null;
                        class120.field2138 = 0;
                        class66.field1213 = null;
                        class40.field621 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class234.field4175.method840((byte) -13);
                class186.field3438 = null;
                class40.field621 = null;
                class120.field2138 = 0;
                class66.field1213 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static void method809(int arg0) {
        if (arg0 <= 113) {
            field1925 = null;
        }
        field1935 = null;
        field1925 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1934;
        if (~class277.field4967 >= ~arg4 && ~arg0 >= ~class147.field2593 && ~arg3 <= ~class26.field342 && arg1 <= class271.field4820) {
            class207.method1463(arg4, arg1, (byte) 84, arg0, arg2, arg3);
        } else {
            class282.method1937(73, arg2, arg3, arg0, arg4, arg1);
        }
        if (arg5 < 99) {
            method809(80);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1930 = arg2;
        this.field1927 = arg1;
        this.field1922 = arg0;
        this.field1924 = arg3;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Z")
    public static final boolean method811(int arg0, int arg1) {
        ++field1931;
        if (arg0 != 11077) {
            return false;
        } else {
            class250.field4497 = true;
            class180.field3177 = arg1 + 1 & 65535;
            return true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILs;I)V")
    public static final void method812(int arg0, int arg1, class237 arg2, int arg3) {
        if (arg2.field3840 == arg1 && ~arg1 != 0) {
            class31 var4 = class131.method964(arg1, true);
            int var5 = var4.field471;
            if (~var5 == -2) {
                arg2.field3856 = 0;
                arg2.field3869 = arg3;
                arg2.field3817 = 1;
                arg2.field3852 = 0;
                arg2.field3811 = 0;
                class55.method309(arg2.field3784, arg2.field3852, var4, arg2.field3868, -17474, class166.field2927 == arg2);
            }
            if (~var5 == -3) {
                arg2.field3856 = 0;
            }
        } else if (arg1 == -1 || ~arg2.field3840 == 0 || class131.method964(arg1, true).field475 >= class131.method964(arg2.field3840, true).field475) {
            arg2.field3817 = 1;
            arg2.field3856 = 0;
            arg2.field3811 = 0;
            arg2.field3840 = arg1;
            arg2.field3869 = arg3;
            arg2.field3785 = arg2.field3870;
            arg2.field3852 = 0;
            if (~arg2.field3840 != 0) {
                class55.method309(arg2.field3784, arg2.field3852, class131.method964(arg2.field3840, true), arg2.field3868, arg0 + -17506, class166.field2927 == arg2);
            }
        }
        ++field1929;
        if (arg0 != 32) {
            method809(-8);
        }
    }
}
