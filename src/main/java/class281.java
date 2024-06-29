import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class281 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    private boolean field4125 = false;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field4133 = 0;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field4134 = 0;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "J")
    public long field4123;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 9)
    public final void method1895(int arg0) {
        this.field4118 = class327.field4862[this.field4117 << 3];
        field4132++;
        if (arg0 != -19578) {
            return;
        }
        this.field4130 = (int) Math.sqrt((double) (this.field4135 * this.field4135 + this.field4138 * this.field4138 + this.field4127 * this.field4127));
        if (this.field4139 == 0) {
            this.field4139 = 1;
        }
        if (this.field4128 == 0) {
            this.field4123 = 2147483647L;
        } else if (this.field4128 == 1) {
            this.field4123 = (long) (this.field4130 * 8 / this.field4139);
            this.field4123 *= this.field4123;
        } else if (this.field4128 == 2) {
            this.field4123 = (long) (this.field4130 * 8 / this.field4139);
        }
        if (this.field4125) {
            this.field4130 *= -1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILat;)V", line = 45)
    public final void method1896(int arg0, class256 arg1) {
        while (true) {
            int var3 = arg1.method1738((byte) 81);
            if (var3 == 0) {
                if (arg0 != -1) {
                    method1901(3, 111, 78, 19);
                }
                field4137++;
                return;
            }
            this.method1898(arg1, -4, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lgr;", line = 65)
    public static final class137 method1897(byte arg0, int arg1) {
        field4131++;
        if (arg0 != 101) {
            return null;
        }
        class137 var2 = (class137) class178.field2525.method1933((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class444.field6473.method715(arg1, (byte) 68, 5);
        class137 var4 = new class137();
        if (var3 != null) {
            var4.method915(new class256(var3), arg0 ^ 0x4176);
        }
        class178.field2525.method1937(arg0 + 20, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lat;II)V", line = 93)
    private final void method1898(class256 arg0, int arg1, int arg2) {
        if (arg1 != -4) {
            this.method1896(-109, (class256) null);
        }
        if (arg2 == 1) {
            this.field4117 = arg0.method1767(1930493576);
        } else if (arg2 == 2) {
            arg0.method1738((byte) -59);
        } else if (arg2 == 3) {
            this.field4127 = arg0.method1746(arg1 ^ 0xFFFFAE10);
            this.field4138 = arg0.method1746(arg1 + 20976);
            this.field4135 = arg0.method1746(arg1 ^ 0xFFFFAE10);
        } else if (arg2 == 4) {
            this.field4128 = arg0.method1738((byte) 84);
            this.field4139 = arg0.method1746(20972);
        } else if (arg2 == 6) {
            this.field4120 = arg0.method1738((byte) -41);
        } else if (arg2 == 8) {
            this.field4133 = 1;
        } else if (arg2 == 9) {
            this.field4134 = 1;
        } else if (arg2 == 10) {
            this.field4125 = true;
        }
        field4122++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Luk;III)V", line = 157)
    public static final void method1899(class155 arg0, int arg1, int arg2, int arg3) {
        long var4 = class455.field6730[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field2081 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field2083[arg0.field2081++] = class120.field1613[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field2081; var9 < 4; var9++) {
            arg0.field2083[var9] = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Lth;", line = 198)
    public static final class175 method1900(int arg0, int arg1, int arg2) {
        field4140++;
        class175 var3 = new class175();
        var3.field2394 = arg1 + 1 + 5;
        var3.field2415 = arg2 + 5 + 1;
        var3.field2419 = -1;
        var3.field2400 = arg0;
        var3.field2408 = new int[var3.field2415][var3.field2394];
        var3.method1221((byte) -41);
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V", line = 215)
    public static final void method1901(int arg0, int arg1, int arg2, int arg3) {
        field4126++;
        class199 var4 = class271.field4017[arg0][arg1];
        if (arg2 >= 55) {
            class63.method470(var4 == null ? class437.field6371 : var4, 1490, arg3);
        }
    }
}
