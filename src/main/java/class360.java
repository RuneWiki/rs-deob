import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class360 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[[S")
    public static short[][] field5595 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "[Lya;")
    public static class220[] field5592;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)Lit;")
    public static final class514 method2302(int arg0, boolean arg1) {
        field5596++;
        if (!arg1) {
            return null;
        }
        if (arg0 == 0) {
            if ((double) class210.field3335 == 3.0D) {
                return class468.field6957;
            }
            if ((double) class210.field3335 == 4.0D) {
                return class303.field4859;
            }
            if ((double) class210.field3335 == 6.0D) {
                return class166.field2667;
            }
            if ((double) class210.field3335 >= 8.0D) {
                return class171.field2740;
            }
        } else if (arg0 == 1) {
            if ((double) class210.field3335 == 3.0D) {
                return class166.field2667;
            }
            if ((double) class210.field3335 == 4.0D) {
                return class171.field2740;
            }
            if ((double) class210.field3335 == 6.0D) {
                return class23.field314;
            }
            if ((double) class210.field3335 >= 8.0D) {
                return class459.field6809;
            }
        } else if (arg0 == 2) {
            if ((double) class210.field3335 == 3.0D) {
                return class23.field314;
            }
            if ((double) class210.field3335 == 4.0D) {
                return class459.field6809;
            }
            if ((double) class210.field3335 == 6.0D) {
                return class182.field2881;
            }
            if ((double) class210.field3335 >= 8.0D) {
                return class261.field4363;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
    public static void method2303(boolean arg0) {
        if (!arg0) {
            field5595 = null;
        }
        field5592 = null;
        field5595 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBII)V")
    public static final void method2304(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class472.field6996 = arg0;
        class29.field460 = arg4;
        class182.field2877 = arg1;
        if (arg2 != 82) {
            method2304(38, -22, (byte) -14, 110, 99);
        }
        field5594++;
        class235.field4076 = arg3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)B")
    public static final byte method2305(int arg0, int arg1, byte arg2) {
        field5593++;
        if (arg0 != 9) {
            return 0;
        } else if (arg2 < 43) {
            return 31;
        } else {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        }
    }
}
