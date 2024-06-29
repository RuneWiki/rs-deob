import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class293 {

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Z")
    public boolean field4613 = true;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4607 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lkb;")
    public static class39 field4609;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method2047(char arg0, int arg1) {
        field4606++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class246.field3917;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 != -3) {
            method2050((byte) -108, (class39) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILok;II)V", line = 45)
    public static final void method2048(int arg0, class160 arg1, int arg2, int arg3) {
        field4604++;
        if (arg2 != -11766) {
            return;
        }
        if (arg1.field2497 == 0) {
            arg1.field2595 = arg1.field2518;
        } else if (arg1.field2497 == 1) {
            arg1.field2595 = (arg3 - arg1.field2458) / 2 + arg1.field2518;
        } else if (arg1.field2497 == 2) {
            arg1.field2595 = arg3 - arg1.field2458 - arg1.field2518;
        } else if (arg1.field2497 == 3) {
            arg1.field2595 = arg1.field2518 * arg3 >> 14;
        } else if (arg1.field2497 == 4) {
            arg1.field2595 = (arg1.field2518 * arg3 >> 14) + (arg3 - arg1.field2458) / 2;
        } else {
            arg1.field2595 = arg3 - (arg1.field2518 * arg3 >> 14) - arg1.field2458;
        }
        if (arg1.field2597 == 0) {
            arg1.field2602 = arg1.field2509;
        } else if (arg1.field2597 == 1) {
            arg1.field2602 = (arg0 - arg1.field2590) / 2 + arg1.field2509;
        } else if (arg1.field2597 == 2) {
            arg1.field2602 = arg0 - arg1.field2590 - arg1.field2509;
        } else if (arg1.field2597 == 3) {
            arg1.field2602 = arg1.field2509 * arg0 >> 14;
        } else if (arg1.field2597 == 4) {
            arg1.field2602 = (arg1.field2509 * arg0 >> 14) + (arg0 - arg1.field2590) / 2;
        } else {
            arg1.field2602 = arg0 - arg1.field2590 - (arg1.field2509 * arg0 >> 14);
        }
        if (!class147.field2201 || !(client.method1913(arg1).field2725 != 0 || arg1.field2608 == 0)) {
            return;
        }
        if (arg1.field2602 < 0) {
            arg1.field2602 = 0;
        } else if (arg0 < arg1.field2602 + arg1.field2590) {
            arg1.field2602 = arg0 - arg1.field2590;
        }
        if (arg1.field2595 < 0) {
            arg1.field2595 = 0;
        } else if (arg1.field2595 + arg1.field2458 > arg3) {
            arg1.field2595 = arg3 - arg1.field2458;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 118)
    public static void method2049(int arg0) {
        if (arg0 != -301) {
            field4607 = -94;
        }
        field4609 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLkb;)V", line = 138)
    public static final void method2050(byte arg0, class39 arg1) {
        class230.field3665 = arg1;
        field4614++;
        if (arg0 != -127) {
            method2050((byte) 82, (class39) null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIZ)V", line = 153)
    public class293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4608 = arg5;
        this.field4611 = arg1;
        this.field4612 = arg3;
        this.field4605 = arg2;
        this.field4613 = arg6;
        this.field4610 = arg0;
        this.field4615 = arg4;
    }
}
