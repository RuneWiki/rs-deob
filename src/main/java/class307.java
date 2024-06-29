import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class307 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
    private boolean field4649 = false;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field4655 = 0;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field4664 = 0;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Z")
    public static boolean field4661 = false;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4652 = 1;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    private int field4666;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field4669;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "J")
    public long field4665;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lwp;")
    public static class121 field4660;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 8)
    public static void method1963(int arg0) {
        field4660 = null;
        if (arg0 != -13308) {
            method1963(-44);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lnn;I)V", line = 21)
    public final void method1964(class289 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1858(arg1 ^ 0xFFFFF340);
            if (var3 == 0) {
                if (arg1 != 8) {
                    field4652 = -122;
                }
                field4663++;
                return;
            }
            this.method1965(arg0, (byte) -98, var3);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lnn;BI)V", line = 58)
    private final void method1965(class289 arg0, byte arg1, int arg2) {
        field4651++;
        if (arg2 == 1) {
            this.field4666 = arg0.method1841((byte) 99);
        } else if (arg2 == 2) {
            arg0.method1858(-3256);
        } else if (arg2 == 3) {
            this.field4670 = arg0.method1815((byte) -100);
            this.field4653 = arg0.method1815((byte) -113);
            this.field4659 = arg0.method1815((byte) -109);
        } else if (arg2 == 4) {
            this.field4650 = arg0.method1858(-3256);
            this.field4658 = arg0.method1815((byte) -91);
        } else if (arg2 == 6) {
            this.field4667 = arg0.method1858(arg1 ^ 0xCD6);
        } else if (arg2 == 8) {
            this.field4664 = 1;
        } else if (arg2 == 9) {
            this.field4655 = 1;
        } else if (arg2 == 10) {
            this.field4649 = true;
        }
        if (arg1 != -98) {
            this.field4665 = -52L;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 123)
    public final void method1966(byte arg0) {
        if (arg0 != 50) {
            return;
        }
        this.field4669 = class407.field6168[this.field4666 << 3];
        field4668++;
        this.field4654 = (int) Math.sqrt((double) (this.field4670 * this.field4670 - (-(this.field4659 * this.field4659) - (this.field4653 * this.field4653))));
        if (this.field4658 == 0) {
            this.field4658 = 1;
        }
        if (this.field4650 == 0) {
            this.field4665 = 2147483647L;
        } else if (this.field4650 == 1) {
            this.field4665 = (this.field4654 * 8 / this.field4658);
            this.field4665 *= this.field4665;
        } else if (this.field4650 == 2) {
            this.field4665 = (this.field4654 * 8 / this.field4658);
        }
        if (this.field4649) {
            this.field4654 *= -1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)Z", line = 161)
    public static final boolean method1967(int arg0, byte arg1, int arg2) {
        if (arg1 != 102) {
            field4660 = null;
        }
        field4657++;
        return (arg2 & 0x10000) != 0;
    }
}
