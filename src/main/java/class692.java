import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class692 extends class243 {

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    private int field9675 = 1024;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
    private int field9671 = 2048;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
    private int field9679 = 3072;

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "[I")
    public static int[] field9674 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "Ljava/lang/String;")
    public static String field9682 = null;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "[I")
    public static int[] field9672;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method85((byte) -46);
        }
        ++field9673;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, 0);
            for (int var5 = 0; var5 < class687.field9628; ++var5) {
                var3[var5] = (var4[var5] * this.field9671 >> 12) + this.field9675;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 38)
    public static final Class method3901(int arg0, String arg1) throws ClassNotFoundException {
        ++field9677;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            int var2 = -24 % ((-20 - arg0) / 59);
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Loi;II)V", line = 76)
    public static final void method3902(class74 arg0, int arg1, int arg2) {
        ++field9678;
        int var3 = -1;
        int var4 = 0;
        if (~class406.field5732 <= ~arg0.field843) {
            if (arg0.field883 >= class406.field5732) {
                class218.method1233((byte) 20, arg0);
            } else {
                class168.method981((byte) 38, false, arg0);
                var4 = class68.field754;
                var3 = class330.field4458;
            }
        } else {
            class272.method1626(arg2 + 24500, arg0);
        }
        if (arg0.field2170 < 512 || arg0.field2165 < 512 || arg0.field2170 >= class272.field3589 * 512 + -512 || ~arg0.field2165 <= ~(class3.field26 * 512 - 512)) {
            arg0.field829 = -1;
            arg0.field821 = null;
            arg0.field810 = -1;
            var3 = -1;
            var4 = 0;
            arg0.field883 = 0;
            arg0.field871 = -1;
            arg0.field843 = 0;
            arg0.field2170 = arg0.field898[0] * 512 - -(256 * arg0.method543(0));
            arg0.field2165 = arg0.field899[0] * 512 + 256 * arg0.method543(0);
            arg0.method540(0);
        }
        if (arg2 != -12212) {
            field9672 = null;
        }
        if (class653.field9086 == arg0 && (~arg0.field2170 > -6145 || ~arg0.field2165 > -6145 || arg0.field2170 >= (class272.field3589 + -12) * 512 || (class3.field26 + -12) * 512 <= arg0.field2165)) {
            arg0.field821 = null;
            arg0.field883 = 0;
            var3 = -1;
            arg0.field871 = -1;
            arg0.field829 = -1;
            arg0.field810 = -1;
            var4 = 0;
            arg0.field843 = 0;
            arg0.field2170 = arg0.field898[0] * 512 + 256 * arg0.method543(arg2 ^ -12212);
            arg0.field2165 = arg0.field899[0] * 512 + 256 * arg0.method543(0);
            arg0.method540(0);
        }
        int var5 = class726.method4071(arg0, 0);
        class45.method273(arg2 + 12114, arg0);
        class402.method2325(var4, arg2 + 18356, arg0, var3, var5);
        class596.method3298((byte) 37, var3, arg0);
        class577.method3231(arg0, -28111);
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 146)
    public class692() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILji;B)V", line = 159)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 > -92) {
            this.method2(64, -121);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field3159 = arg1.method3428((byte) 40) == 1;
                }
            } else {
                this.field9679 = arg1.method3402((byte) 127);
            }
        } else {
            this.field9675 = arg1.method3402((byte) 127);
        }
        ++field9681;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V", line = 213)
    public static void method3903(int arg0) {
        field9672 = null;
        int var1 = -70 % ((-39 - arg0) / 52);
        field9682 = null;
        field9674 = null;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[[I", line = 225)
    public final int[][] method2(int arg0, int arg1) {
        ++field9680;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class687.field9628; ++var11) {
                var8[var11] = this.field9675 - -(var5[var11] * this.field9671 >> 12);
                var9[var11] = (var6[var11] * this.field9671 >> 12) + this.field9675;
                var10[var11] = (var7[var11] * this.field9671 >> 12) + this.field9675;
            }
        }
        if (arg0 >= -76) {
            method3902((class74) null, 10, -90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)V", line = 278)
    public final void method85(byte arg0) {
        this.field9671 = -this.field9675 + this.field9679;
        ++field9676;
        if (arg0 != 66) {
            this.method5(-42, 80);
        }
    }
}
