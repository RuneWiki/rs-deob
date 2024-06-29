import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class705 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
    private boolean field9967 = false;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public int field9979 = 0;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field9973 = 0;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Lgfa;")
    public static class696 field9976 = new class696(15, 0, 1, 0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field9966;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public int field9968;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public int field9969;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field9970;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field9971;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field9974;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public int field9977;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    private int field9978;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public int field9980;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public int field9982;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "J")
    public long field9975;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lun;Z)V", line = 21)
    public final void method3948(class389 arg0, boolean arg1) {
        if (!arg1) {
            method3951(112);
        }
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                field9965++;
                return;
            }
            this.method3949((byte) 114, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLun;I)V", line = 44)
    private final void method3949(byte arg0, class389 arg1, int arg2) {
        if (arg0 < 112) {
            this.field9970 = -82;
        }
        if (arg2 == 1) {
            this.field9978 = arg1.method2260(-58);
        } else if (arg2 == 2) {
            arg1.method2229(255);
        } else if (arg2 == 3) {
            this.field9969 = arg1.method2255(255);
            this.field9968 = arg1.method2255(255);
            this.field9970 = arg1.method2255(255);
        } else if (arg2 == 4) {
            this.field9982 = arg1.method2229(255);
            this.field9974 = arg1.method2255(255);
        } else if (arg2 == 6) {
            this.field9971 = arg1.method2229(255);
        } else if (arg2 == 8) {
            this.field9979 = 1;
        } else if (arg2 == 9) {
            this.field9973 = 1;
        } else if (arg2 == 10) {
            this.field9967 = true;
        }
        field9972++;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V", line = 99)
    public final void method3950(boolean arg0) {
        this.field9977 = class395.field5582[this.field9978 << 3];
        field9981++;
        if (arg0) {
            return;
        }
        long var2 = (long) this.field9969;
        long var4 = (long) this.field9968;
        long var6 = (long) this.field9970;
        this.field9980 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field9974 == 0) {
            this.field9974 = 1;
        }
        if (this.field9982 == 0) {
            this.field9975 = 2147483647L;
        } else if (this.field9982 == 1) {
            this.field9975 = (this.field9980 * 8 / this.field9974);
            this.field9975 *= this.field9975;
        } else if (this.field9982 == 2) {
            this.field9975 = (this.field9980 * 8 / this.field9974);
        }
        if (this.field9967) {
            this.field9980 *= -1;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 155)
    public static void method3951(int arg0) {
        if (arg0 == 1) {
            field9976 = null;
        }
    }
}
