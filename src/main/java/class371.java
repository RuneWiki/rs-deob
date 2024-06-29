import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class371 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Z")
    private boolean field4655 = false;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public int field4663 = 0;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    public int field4670 = 0;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4658 = 1407;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "[C")
    private static char[] field4671 = new char[64];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public int field4664;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "J")
    public long field4672;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Les;IB)V")
    private final void method2168(class403 arg0, int arg1, byte arg2) {
        if (arg2 != 119) {
            this.field4666 = 20;
        }
        field4657++;
        if (arg1 == 1) {
            this.field4656 = arg0.method2390((byte) 6);
        } else if (arg1 == 2) {
            arg0.method2396((byte) -115);
        } else if (arg1 == 3) {
            this.field4668 = arg0.method2381((byte) 49);
            this.field4654 = arg0.method2381((byte) 44);
            this.field4664 = arg0.method2381((byte) 52);
        } else if (arg1 == 4) {
            this.field4667 = arg0.method2396((byte) 51);
            this.field4661 = arg0.method2381((byte) 64);
        } else if (arg1 == 6) {
            this.field4659 = arg0.method2396((byte) 36);
        } else if (arg1 == 8) {
            this.field4663 = 1;
        } else if (arg1 == 9) {
            this.field4670 = 1;
        } else if (arg1 == 10) {
            this.field4655 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Les;I)V")
    public final void method2169(class403 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field4665++;
        while (true) {
            int var3 = arg0.method2396((byte) 13);
            if (var3 == 0) {
                return;
            }
            this.method2168(arg0, var3, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method2170(byte arg0) {
        field4669++;
        this.field4660 = class789.field10864[this.field4656 << 3];
        long var2 = (long) this.field4668;
        long var4 = (long) this.field4654;
        long var6 = (long) this.field4664;
        this.field4666 = (int) Math.sqrt((double) (var6 * var6 + (var2 * var2 + (var4 * var4))));
        if (this.field4661 == 0) {
            this.field4661 = 1;
        }
        if (arg0 != 75) {
            method2171((byte) 78);
        }
        if (this.field4667 == 0) {
            this.field4672 = 2147483647L;
        } else if (this.field4667 == 1) {
            this.field4672 = (this.field4666 * 8 / this.field4661);
            this.field4672 *= this.field4672;
        } else if (this.field4667 == 2) {
            this.field4672 = (this.field4666 * 8 / this.field4661);
        }
        if (this.field4655) {
            this.field4666 *= -1;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)Ltha;")
    public static final class310 method2171(byte arg0) {
        field4662++;
        try {
            return new class373();
        } catch (Throwable var2) {
            if (arg0 < 73) {
                field4671 = null;
            }
            try {
                return (class310) Class.forName("cd").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class746();
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)V")
    public static void method2172(byte arg0) {
        if (arg0 != 14) {
            field4658 = 63;
        }
        field4671 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4671[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4671[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4671[var2] = (char) (var2 + 48 - 52);
        }
        field4671[63] = '/';
        field4671[62] = '+';
    }
}
