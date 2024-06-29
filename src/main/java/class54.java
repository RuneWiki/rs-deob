import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class54 extends class413 {

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "[I")
    private int[] field768 = new int[this.field5881];

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lrb;")
    public static class283 field764 = new class283(48, 12);

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[S")
    public static short[] field778 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "Lrb;")
    public static class283 field779 = new class283(21, -2);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lvu;")
    public static class155 field780;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Lnd;")
    public static class524 field777;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "[B")
    private byte[] field769;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field5881 < ~var7; ++var7) {
            this.field768[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 27)
    public final void method347(int arg0) {
        this.field770 = Math.abs(this.field770);
        ++field772;
        if (~this.field770 <= -4097) {
            this.field770 = 4095;
        }
        this.method351(264949441, this.field765++, (byte) (this.field770 >> 4));
        this.field770 = 0;
        if (arg0 != 918862444) {
            this.field768 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)I", line = 44)
    public static final int method348(int arg0, boolean arg1) {
        ++field767;
        if (arg1) {
            method353((class444) null, 93, -32, (String) null, (class306) null, (class336) null, (byte) -61, -38, (class61) null, 27, 31, 16);
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 56)
    public static final void method349(int arg0, int arg1) {
        ++field771;
        class372.method2231(-1);
        class92.method757((byte) 61);
        class284.method1632(arg1, (byte) -128, true);
        class402.method2376(class509.field7453, 85, class275.field3737, class300.field4107);
        class325.method1927(0, class509.field7453, class275.field3737);
        class49.method324(true);
        class398.method2360(class409.field5790, 0);
        class157.method1127(1508614222);
        class264.method1552(5);
        int var2 = 123 % ((-29 - arg0) / 48);
        if (~class494.field7155 != -3) {
            if (class494.field7155 != 6) {
                if (class494.field7155 == 9) {
                    class63.method421(10, true);
                    return;
                }
                if (class494.field7155 == 1) {
                    class222.method1385(class275.field3737, (byte) -98, class509.field7453);
                    return;
                }
            } else {
                class63.method421(7, true);
            }
        } else {
            class63.method421(3, true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V", line = 92)
    public final void method350(byte arg0) {
        this.field765 = 0;
        ++field774;
        this.field770 = 0;
        int var2 = 36 % ((27 - arg0) / 47);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIB)V", line = 113)
    public void method351(int arg0, int arg1, byte arg2) {
        ++field775;
        if (arg0 != 264949441) {
            method349(84, 41);
        }
        this.field769[this.field765++] = (byte) (class375.method2245(arg2 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V", line = 124)
    public final void method352(int arg0, int arg1, byte arg2) {
        ++field776;
        this.field770 += this.field768[arg1] * arg0 >> 12;
        int var4 = -123 % ((arg2 - -23) / 61);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lat;IILjava/lang/String;Lla;Lta;BILkt;III)V", line = 139)
    public static final void method353(class444 arg0, int arg1, int arg2, String arg3, class306 arg4, class336 arg5, byte arg6, int arg7, class61 arg8, int arg9, int arg10, int arg11) {
        if (arg6 >= -79) {
            field777 = null;
        }
        ++field766;
        int var12;
        if (class247.field3363 == 4) {
            var12 = 16383 & (int) class191.field2797;
        } else {
            var12 = 16383 & (int) class191.field2797 + class457.field6666;
        }
        int var13 = 10 + Math.max(arg0.field6470 / 2, arg0.field6453 / 2);
        int var14 = arg2 * arg2 + arg10 * arg10;
        if (var14 <= var13 * var13) {
            int var15 = class51.field743[var12];
            int var16 = class51.field731[var12];
            if (~class247.field3363 != -5) {
                var16 = var16 * 256 / (class532.field7816 + 256);
                var15 = var15 * 256 / (class532.field7816 - -256);
            }
            int var17 = arg2 * var15 + arg10 * var16 >> 15;
            int var18 = arg2 * var16 - arg10 * var15 >> 15;
            int var19 = arg8.method408(0, (class359[]) null, 100, arg3);
            int var20 = var17 - var19 / 2;
            int var21 = arg8.method410(100, arg3, 0, (class359[]) null, -1);
            if (-arg0.field6470 <= var20 && ~arg0.field6470 <= ~var20 && ~var18 <= ~(-arg0.field6453) && ~arg0.field6453 <= ~var18) {
                arg4.method1774(arg5, var19, 1, var20 - -(arg0.field6470 / 2) + arg9, arg0.field6453 / 2 - arg7 + arg1 + -var18 + -var21, -22809, arg1, 0, arg9, (class359[]) null, (int[]) null, arg11, 0, arg3, 50, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V", line = 192)
    public static void method354(boolean arg0) {
        if (!arg0) {
            field764 = null;
        }
        field780 = null;
        field777 = null;
        field764 = null;
        field778 = null;
        field779 = null;
    }
}
