import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class591 extends class539 implements class310 {

    @OriginalMember(owner = "client!am", name = "N", descriptor = "Las;")
    public class142 field7942;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "Z")
    private boolean field7941;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "[F")
    public static float[] field7932 = new float[4];

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field7943 = 0;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "Lqt;")
    private class595 field7940;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I", line = 4)
    public final int method131(byte arg0) {
        if (arg0 != -97) {
            return -92;
        } else {
            ++field7937;
            return this.field7942.field1727;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 18)
    public final void method132(int arg0) {
        ++field7938;
        if (arg0 != -13968) {
            this.field7940 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Z", line = 28)
    public final boolean method133(boolean arg0) {
        ++field7939;
        if (arg0) {
            this.field7942 = null;
        }
        return this.field7942.method899(-1);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Loa;Lpg;IIIIIZIIIIII)V", line = 39)
    public class591(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class339.method1949(arg12, arg11, 83));
        this.field7942 = new class142(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field7941 = ~arg1.field9382 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)I", line = 52)
    public final int method1858(byte arg0) {
        if (arg0 < 6) {
            this.method139((byte) 118);
        }
        ++field7930;
        return this.field7942.method895(10);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 63)
    public static final void method3276(long[] arg0, Object[] arg1, byte arg2) {
        ++field7929;
        class484.method2632(arg0, arg0.length + -1, 0, 104, arg1);
        int var3 = -72 / ((-42 - arg2) / 49);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I", line = 73)
    public final int method139(byte arg0) {
        ++field7934;
        return arg0 < 13 ? 104 : this.field7942.field1705;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILoa;)Lww;", line = 85)
    public final class686 method11(int arg0, class650 arg1) {
        ++field7936;
        class359 var3 = this.field7942.method891(2048, arg1, (byte) 120, super.field6808, false, super.field6793, true);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method470();
            var4.method591(super.field6800 + super.field6793, super.field6802, super.field6808 + super.field6795);
            class686 var5 = null;
            if (this.field7941) {
                var5 = class458.method2520(0, 1);
            }
            int var6 = super.field6793 >> 9;
            int var7 = super.field6808 >> 9;
            this.field7942.method896(var4, true, var6, var3, var6, arg1, (byte) -93, var7, var7);
            if (this.field7942.field1722 != null) {
                class228 var8 = this.field7942.field1722.method105();
                arg1.method427(var3, var8, var4, var5 != null ? var5.field9361[0] : null, 0);
            } else {
                var3.method2049(var4, var5 == null ? null : var5.field9361[0], 0);
            }
            if (this.field7940 != null) {
                class236.method1423(var3, false, super.field6808, super.field6802, this.field7940, super.field6793);
            } else {
                this.field7940 = class280.method1688(var3, super.field6808, -1, super.field6802, super.field6793);
            }
            return arg0 > -89 ? null : var5;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BILoa;I)Z", line = 132)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field7928;
        int var5 = -80 % ((77 - arg0) / 40);
        class359 var6 = this.field7942.method891(131072, arg2, (byte) -94, super.field6808, false, super.field6793, false);
        if (var6 == null) {
            return false;
        } else {
            class396 var7 = arg2.method470();
            var7.method591(super.field6800 + super.field6793, super.field6802, super.field6808 + super.field6795);
            return var6.method2074(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Loa;B)V", line = 154)
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 == 98) {
            ++field7935;
            class359 var3 = this.field7942.method891(262144, arg0, (byte) 87, super.field6808, false, super.field6793, true);
            if (var3 != null) {
                int var4 = super.field6793 >> 9;
                int var5 = super.field6808 >> 9;
                class396 var6 = arg0.method470();
                var6.method591(super.field6793, super.field6802, super.field6808);
                this.field7942.method896(var6, false, var4, var3, var4, arg0, (byte) -93, var5, var5);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Loa;I)V", line = 179)
    public final void method136(class650 arg0, int arg1) {
        ++field7931;
        this.field7942.method893(false, arg0);
        int var3 = -27 % ((arg1 - -78) / 37);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Loa;B)V", line = 195)
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 > -27) {
            this.field7941 = false;
        }
        this.field7942.method890(arg0, -84);
        ++field7944;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Loa;BI)Lba;", line = 212)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            this.field7941 = true;
        }
        ++field7927;
        return this.field7942.method891(arg2, arg0, (byte) 71, 0, false, 0, false);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Loa;I)Lqt;", line = 223)
    public final class595 method6(class650 arg0, int arg1) {
        ++field7933;
        if (arg1 != -7459) {
            this.field7942 = null;
        }
        return this.field7940;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lji;B)Leea;", line = 238)
    public static final class122 method3277(class572 arg0, byte arg1) {
        if (arg1 < 83) {
            return null;
        } else {
            ++field7945;
            return new class122(arg0.method3086(65280), arg0.method3086(65280), arg0.method3086(65280), arg0.method3086(65280), arg0.method3059(1), arg0.method3097((byte) 12));
        }
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 249)
    public static void method3278(int arg0) {
        field7932 = null;
        if (arg0 != 0) {
            method3276((long[]) null, (Object[]) null, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I", line = 261)
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            this.field7940 = null;
        }
        ++field7926;
        return this.field7942.field1719;
    }
}
