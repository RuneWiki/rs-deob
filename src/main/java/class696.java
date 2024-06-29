import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class696 {

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public int field9801 = 0;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public int field9797 = 0;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
    private boolean field9808 = false;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9811 = new Rectangle[100];

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public int field9791;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    private int field9794;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public int field9795;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public int field9798;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public int field9800;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public int field9802;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public int field9803;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public int field9805;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field9806;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public int field9807;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "J")
    public long field9804;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
    public static boolean field9809;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9811[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method3910(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class697.field9813 != null) {
            class697.field9813[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class267.field3482 != null) {
            class267.field3482[arg0][arg1] = (short) arg3;
        }
        if (class319.field4644 != null) {
            class319.field4644[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 22)
    public static void method3911(int arg0) {
        if (arg0 <= 85) {
            field9809 = true;
        }
        field9811 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILgk;)V", line = 37)
    private final void method3912(int arg0, int arg1, class540 arg2) {
        if (arg1 == 1) {
            this.field9794 = arg2.method3169(26488);
        } else if (arg1 == 2) {
            arg2.method3115(29871);
        } else if (arg1 == 3) {
            this.field9803 = arg2.method3160(false);
            this.field9807 = arg2.method3160(false);
            this.field9795 = arg2.method3160(false);
        } else if (arg1 == 4) {
            this.field9791 = arg2.method3115(29871);
            this.field9798 = arg2.method3160(false);
        } else if (arg1 == 6) {
            this.field9805 = arg2.method3115(29871);
        } else if (arg1 == 8) {
            this.field9801 = 1;
        } else if (arg1 == 9) {
            this.field9797 = 1;
        } else if (arg1 == 10) {
            this.field9808 = true;
        }
        int var4 = 29 % ((-arg0 - 54) / 38);
        field9792++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 91)
    public final void method3913(byte arg0) {
        field9810++;
        this.field9806 = class271.field3544[this.field9794 << 3];
        long var2 = (long) this.field9803;
        long var4 = (long) this.field9807;
        long var6 = (long) this.field9795;
        if (arg0 >= -95) {
            method3910(-101, -15, -94, 107, -26);
        }
        this.field9800 = (int) Math.sqrt((double) (var2 * var2 - (-(var4 * var4) - var6 * var6)));
        if (this.field9798 == 0) {
            this.field9798 = 1;
        }
        if (this.field9791 == 0) {
            this.field9804 = 2147483647L;
        } else if (this.field9791 == 1) {
            this.field9804 = (this.field9800 * 8 / this.field9798);
            this.field9804 *= this.field9804;
        } else if (this.field9791 == 2) {
            this.field9804 = (this.field9800 * 8 / this.field9798);
        }
        if (this.field9808) {
            this.field9800 *= -1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLgk;)V", line = 134)
    public final void method3914(byte arg0, class540 arg1) {
        if (arg0 != 82) {
            method3911(-45);
        }
        while (true) {
            int var3 = arg1.method3115(arg0 + 29789);
            if (var3 == 0) {
                field9799++;
                return;
            }
            this.method3912(-102, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 158)
    public static final String method3915(byte arg0, String arg1, String arg2, String arg3) {
        field9793++;
        if (arg0 != -55) {
            method3915((byte) 88, null, null, null);
        }
        for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, arg3.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(var4 + arg2.length());
        }
        return arg1;
    }
}
