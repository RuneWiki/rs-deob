import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class238 {

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
    private boolean field3428 = false;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public int field3427 = 0;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public int field3432 = 0;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field3438 = 2;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "J")
    public long field3422;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Ldp;")
    public static class174 field3425;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILec;)V")
    private final void method1731(int arg0, int arg1, class37 arg2) {
        if (arg1 == 1) {
            this.field3429 = arg2.method320((byte) -87);
        } else if (arg1 == 2) {
            arg2.method271((byte) 109);
        } else if (arg1 == 3) {
            this.field3440 = arg2.method278(arg0 ^ 0x7D);
            this.field3433 = arg2.method278(-114);
            this.field3434 = arg2.method278(99);
        } else if (arg1 == 4) {
            this.field3437 = arg2.method271((byte) 121);
            this.field3424 = arg2.method278(-113);
        } else if (arg1 == 6) {
            this.field3431 = arg2.method271((byte) 124);
        } else if (arg1 == 8) {
            this.field3427 = 1;
        } else if (arg1 == 9) {
            this.field3432 = 1;
        } else if (arg1 == 10) {
            this.field3428 = true;
        }
        field3435++;
        if (arg0 != -9) {
            method1734(71, false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public static final void method1732(int arg0, int arg1) {
        class117.field1854 = arg0;
        if (arg1 >= -65) {
            field3425 = null;
        }
        field3420++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLec;)V")
    public final void method1733(byte arg0, class37 arg1) {
        while (true) {
            int var3 = arg1.method271((byte) 115);
            if (var3 == 0) {
                field3423++;
                if (arg0 < 26) {
                    this.field3421 = 15;
                    return;
                }
                return;
            }
            this.method1731(-9, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
    public static final void method1734(int arg0, boolean arg1) {
        field3439++;
        class187.field2777 = arg0;
        class18 var2 = class413.field5992;
        synchronized (class413.field5992) {
            class413.field5992.method106((byte) -118);
            if (arg1) {
                method1734(-83, false);
            }
        }
        class18 var3 = class398.field5858;
        synchronized (class398.field5858) {
            class398.field5858.method106((byte) -121);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method1735(int arg0) {
        if (arg0 != 2269) {
            field3425 = null;
        }
        field3425 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public final void method1736(boolean arg0) {
        field3436++;
        this.field3421 = class56.field898[this.field3429 << 3];
        this.field3426 = (int) Math.sqrt((double) (this.field3440 * this.field3440 + (this.field3433 * this.field3433) + (this.field3434 * this.field3434)));
        if (this.field3424 == 0) {
            this.field3424 = 1;
        }
        if (this.field3437 == 0) {
            this.field3422 = 2147483647L;
        } else if (this.field3437 == 1) {
            this.field3422 = (long) (this.field3426 * 8 / this.field3424);
            this.field3422 *= this.field3422;
        } else if (this.field3437 == 2) {
            this.field3422 = (long) (this.field3426 * 8 / this.field3424);
        }
        if (this.field3428) {
            this.field3426 *= -1;
        }
        if (arg0) {
            this.field3437 = -74;
        }
    }
}
