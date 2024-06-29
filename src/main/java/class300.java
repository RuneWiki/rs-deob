import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class300 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public int field4547 = -1;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "Z")
    public boolean field4555 = false;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public int field4557 = -1;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Z")
    public boolean field4556 = true;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public int field4559 = 16;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public int field4558 = 128;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public int field4554 = 0;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "Z")
    public boolean field4563 = true;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public int field4551 = 127;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public int field4560 = 8;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public int field4566 = -1;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public int field4562 = 1190717;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4550 = 0;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Lcq;")
    public class329 field4553;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 6)
    public final void method1937(int arg0) {
        if (arg0 != 11115) {
            this.field4558 = 32;
        }
        this.field4560 = this.field4567 | this.field4560 << 8;
        if (this.field4557 == -1) {
            this.field4557 = this.field4547;
        }
        field4549++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/lang/String;)I", line = 27)
    public static final int method1938(int arg0, String arg1) {
        field4548++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class121.method903(-8303, arg1.charAt(var4)) - var3;
        }
        if (arg0 != 11) {
            field4550 = 17;
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILhp;)V", line = 51)
    public final void method1939(int arg0, class217 arg1) {
        while (true) {
            int var3 = arg1.method1515((byte) 122);
            if (var3 == 0) {
                if (arg0 != -1) {
                    method1942(56, -101, 75, -17, true, 93);
                }
                field4564++;
                return;
            }
            this.method1941(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z", line = 94)
    public static final boolean method1940(boolean arg0, int arg1) {
        field4561++;
        if (arg0) {
            field4550 = -20;
        }
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILhp;I)V", line = 121)
    private final void method1941(int arg0, class217 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4554 = class284.method1841(false, arg1.method1548(31529));
        } else if (arg2 == 2) {
            this.field4547 = arg1.method1515((byte) 123);
        } else if (arg2 == 3) {
            this.field4547 = arg1.method1511(-28);
            if (this.field4547 == 65535) {
                this.field4547 = -1;
            }
        } else if (arg2 == 5) {
            this.field4556 = false;
        } else if (arg2 == 7) {
            this.field4566 = class284.method1841(false, arg1.method1548(31529));
        } else if (arg2 == 8) {
            this.field4553.field4951 = this.field4567;
        } else if (arg2 == 9) {
            this.field4558 = arg1.method1511(74) << 0;
        } else if (arg2 == 10) {
            this.field4563 = false;
        } else if (arg2 == 11) {
            this.field4560 = arg1.method1515((byte) 125);
        } else if (arg2 == 12) {
            this.field4555 = true;
        } else if (arg2 == 13) {
            this.field4562 = arg1.method1548(31529);
        } else if (arg2 == 14) {
            this.field4559 = arg1.method1515((byte) 121) << 0;
        } else if (arg2 == 15) {
            this.field4557 = arg1.method1511(arg0 - 54);
            if (this.field4557 == 65535) {
                this.field4557 = -1;
            }
        } else if (arg2 == 16) {
            this.field4551 = arg1.method1515((byte) 122);
        }
        if (arg0 != 0) {
            this.field4557 = -89;
        }
        field4565++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIZI)V", line = 204)
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4552++;
        long var6 = (long) (arg5 | (arg4 ? Integer.MIN_VALUE : 0));
        class240 var8 = (class240) class371.field5530.method2585((byte) 114, var6);
        if (arg3 != 0) {
            method1942(-121, -31, 19, 88, true, -121);
        }
        if (var8 == null) {
            var8 = new class240();
            class371.field5530.method2591(var6, var8, (byte) -123);
        }
        if (arg2 >= var8.field3835.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field3835.length; var11++) {
                var9[var11] = var8.field3835[var11];
                var10[var11] = var8.field3829[var11];
            }
            for (int var12 = var8.field3835.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3829 = var10;
            var8.field3835 = var9;
        }
        var8.field3835[arg2] = arg0;
        var8.field3829[arg2] = arg1;
    }
}
