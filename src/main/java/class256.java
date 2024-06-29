import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class256 extends class46 {

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field4006 = 0;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[Lv;")
    public static class75[] field4018 = new class75[14];

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field4016 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[[[Lff;")
    public static class142[][][] field4013;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)Z", line = 6)
    public final boolean method1752(byte arg0, int arg1, int arg2) {
        field4004++;
        if (arg0 != 126) {
            this.method1753(66, -46, 94, 34);
        }
        return arg2 >= this.field4005 && arg2 <= this.field4012 && arg1 >= this.field4002 && this.field4001 >= arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)Z", line = 23)
    public final boolean method1753(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 122) {
            return true;
        } else {
            field4019++;
            return this.field4007 == arg2 && this.field4005 <= arg3 && this.field4012 >= arg3 && arg1 >= this.field4002 && this.field4001 >= arg1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)[I", line = 39)
    public final int[] method1754(int arg0, int arg1, int arg2) {
        if (arg0 == -30460) {
            field4017++;
            return new int[] { this.field4007, this.field4005 + arg2 - this.field4011, -this.field4015 - (-this.field4002 - arg1) };
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZII)Z", line = 55)
    public final boolean method1755(boolean arg0, int arg1, int arg2) {
        field4010++;
        if (!arg0) {
            method1759(104);
        }
        return this.field4011 <= arg2 && arg2 <= this.field4014 && arg1 >= this.field4015 && this.field4008 >= arg1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZII)[I", line = 76)
    public final int[] method1756(boolean arg0, int arg1, int arg2) {
        field4009++;
        if (!arg0) {
            this.method1755(true, -87, -47);
        }
        return new int[] { this.field4020, this.field4011 + arg1 - this.field4005, this.field4015 + arg2 + -this.field4002 };
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 98)
    public static void method1757(int arg0) {
        field4018 = null;
        field4013 = (class142[][][]) null;
        if (arg0 != 10192) {
            field4006 = 76;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(ZII)V", line = 115)
    public static final void method1758(boolean arg0, int arg1, int arg2) {
        field4021++;
        if (class321.method2189(arg1, (byte) 79) && arg0) {
            class274.method1882(24236, arg2, class163.field2463[arg1]);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I", line = 134)
    public static final int method1759(int arg0) {
        if (arg0 < 44) {
            return -111;
        }
        field4003++;
        if (class195.field2917 != null) {
            return 3;
        } else if (class94.field1516 && class116.field1774) {
            return 2;
        } else if (class94.field1516 && !class116.field1774) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 154)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4014 = arg8;
        this.field4001 = arg5;
        this.field4020 = arg1;
        this.field4007 = arg0;
        this.field4008 = arg9;
        this.field4015 = arg7;
        this.field4002 = arg3;
        this.field4012 = arg4;
        this.field4011 = arg6;
        this.field4005 = arg2;
    }
}
