import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class251 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Z")
    private boolean field3663 = false;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field3672 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public int field3675 = 0;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lpp;")
    public static class464 field3682 = new class464(75, 0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "J")
    public long field3669;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1586(byte arg0, String arg1) {
        field3678++;
        if (arg0 >= -118) {
            field3682 = null;
        }
        String var2 = class186.method1249(-99, class640.method3691(-10880, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3682 = null;
        if (arg0 != 6) {
            method1588(-45);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method1588(int arg0) {
        field3667++;
        if (arg0 != -21618) {
            method1587(122);
        }
        if (class40.field554 != 3 && class69.field1302.field3409 != -1) {
            class177.method1207(40000, class69.field1302.field3411, class69.field1302.field3409);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILco;)V")
    private final void method1589(int arg0, int arg1, class268 arg2) {
        field3677++;
        if (arg1 < 26) {
            this.field3681 = 73;
        }
        if (arg0 == 1) {
            this.field3673 = arg2.method1745(32132);
        } else if (arg0 == 2) {
            arg2.method1738(255);
        } else if (arg0 == 3) {
            this.field3670 = arg2.method1748(-121);
            this.field3676 = arg2.method1748(-81);
            this.field3662 = arg2.method1748(-77);
        } else if (arg0 == 4) {
            this.field3679 = arg2.method1738(255);
            this.field3666 = arg2.method1748(-101);
        } else if (arg0 == 6) {
            this.field3664 = arg2.method1738(255);
        } else if (arg0 == 8) {
            this.field3675 = 1;
        } else if (arg0 == 9) {
            this.field3672 = 1;
        } else if (arg0 == 10) {
            this.field3663 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lco;Z)V")
    public final void method1590(class268 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                if (arg1) {
                    this.field3669 = 123L;
                }
                field3671++;
                return;
            }
            this.method1589(var3, 106, arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method1591(byte arg0) {
        this.field3681 = class285.field4152[this.field3673 << 3];
        field3680++;
        this.field3668 = (int) Math.sqrt((double) (this.field3662 * this.field3662 + (this.field3670 * this.field3670 + (this.field3676 * this.field3676))));
        if (arg0 >= -93) {
            this.field3664 = 71;
        }
        if (this.field3666 == 0) {
            this.field3666 = 1;
        }
        if (this.field3679 == 0) {
            this.field3669 = 2147483647L;
        } else if (this.field3679 == 1) {
            this.field3669 = (this.field3668 * 8 / this.field3666);
            this.field3669 *= this.field3669;
        } else if (this.field3679 == 2) {
            this.field3669 = (this.field3668 * 8 / this.field3666);
        }
        if (this.field3663) {
            this.field3668 *= -1;
        }
    }
}
