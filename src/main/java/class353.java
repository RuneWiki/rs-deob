import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class353 extends class262 {

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
    private boolean field4725 = false;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field4716 = -2;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "[I")
    public static int[] field4720 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "[[I")
    public static int[][] field4714 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field4718 = -1;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method372(boolean arg0, int arg1) {
        ++field4715;
        super.field3601.method2303((byte) -128, class231.field3011, class652.field9230);
        if (arg1 != 0) {
            field4723 = -74;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lht;", line = 15)
    public static final class537 method1997(int arg0, int arg1) {
        ++field4727;
        class537 var2 = (class537) class656.field9311.method3241(-26958, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class351.field4691.method3800(0, arg0, (byte) -92);
            if (arg1 != 1756) {
                field4719 = 47;
            }
            if (var3 != null && ~var3.length < -2) {
                class537 var4;
                try {
                    var4 = class185.method1150(arg1 + -1881, var3);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                }
                class656.field9311.method3240(var4, -122, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILoa;B)V", line = 45)
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field4726;
        if (arg2 <= 80) {
            this.method374(-18);
        }
        super.field3601.method2316((byte) 112, arg1);
        super.field3601.method2362(arg0, false);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z", line = 58)
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            return true;
        } else {
            ++field4728;
            return true;
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)V", line = 71)
    public static void method1998(byte arg0) {
        field4720 = null;
        if (arg0 <= 78) {
            method1997(-86, -83);
        }
        field4714 = null;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 83)
    public final void method374(int arg0) {
        if (arg0 <= 42) {
            method1998((byte) -2);
        }
        if (!this.field4725) {
            super.field3601.method2348(0, 6655, class519.field7612);
        } else {
            super.field3601.method2318(1, -30954);
            super.field3601.method471(class620.field8888, -50);
            super.field3601.method2303((byte) -92, class652.field9230, class652.field9230);
            super.field3601.method2301(2, class308.field4083, 2);
            super.field3601.method2348(0, 6655, class519.field7612);
            super.field3601.method2305(20921);
            super.field3601.method2316((byte) 94, (class644) null);
            super.field3601.method2318(0, -30954);
            this.field4725 = false;
        }
        ++field4717;
        super.field3601.method2303((byte) 76, class652.field9230, class652.field9230);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBIIIIII)V", line = 109)
    public static final void method1999(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4724;
        int var10 = 41 % ((27 - arg3) / 53);
        if (~arg9 <= ~class587.field8513 && ~arg9 >= ~class221.field2866 && class587.field8513 <= arg0 && ~class221.field2866 <= ~arg0 && ~arg5 <= ~class587.field8513 && ~arg5 >= ~class221.field2866 && arg6 >= class587.field8513 && class221.field2866 >= arg6 && arg8 >= class598.field8632 && arg8 <= class288.field3883 && class598.field8632 <= arg1 && arg1 <= class288.field3883 && ~class598.field8632 >= ~arg7 && ~arg7 >= ~class288.field3883 && class598.field8632 <= arg4 && ~arg4 >= ~class288.field3883) {
            class55.method582(arg4, arg5, arg8, arg0, arg9, arg7, arg2, arg1, arg6, -9990);
        } else {
            class549.method3214(arg7, arg0, arg4, arg8, arg9, arg2, arg5, 87, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)V", line = 128)
    public final void method373(int arg0, boolean arg1, int arg2) {
        ++field4729;
        if (!arg1) {
            this.method372(true, 90);
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lifa;)V", line = 138)
    public class353(class393 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V", line = 164)
    public final void method377(int arg0, boolean arg1) {
        ++field4722;
        if (arg0 >= 37) {
            class629 var3 = super.field3601.method2372((byte) 98);
            if (var3 != null && arg1) {
                super.field3601.method2318(1, -30954);
                super.field3601.method2316((byte) 95, var3);
                super.field3601.method471(class368.field4949, -107);
                super.field3601.method2318(1, -30954);
                super.field3601.method2303((byte) -74, class231.field3011, class442.field6300);
                super.field3601.method512(true, 2, 9494, class141.field1760, false);
                super.field3601.method2348(0, 6655, class366.field4928);
                class653 var4 = super.field3601.method2373((byte) -74);
                var4.method3698(super.field3601.method2349((byte) -17), (byte) -10);
                super.field3601.method2319((byte) 74, class582.field8475);
                super.field3601.method2318(0, -30954);
                this.field4725 = true;
            } else {
                super.field3601.method2348(0, 6655, class366.field4928);
            }
        }
    }
}
