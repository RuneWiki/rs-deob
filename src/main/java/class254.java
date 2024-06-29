import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class254 extends class43 {

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lpj;")
    public static class79 field3480 = new class79(64);

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3485 = 1;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3487 = 52;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3486 = 0;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 4)
    public static void method1564(int arg0) {
        if (arg0 == 4) {
            field3480 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I", line = 15)
    public static final int method1565(byte arg0, int arg1) {
        if (arg0 >= -46) {
            method1565((byte) -76, -86);
        }
        field3484++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILqj;)V", line = 30)
    public static final void method1566(int arg0, class296 arg1) {
        class427.field6137 = arg1;
        if (arg0 == 20731) {
            field3482++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILrg;BZ)V", line = 51)
    public static final void method1567(int arg0, int arg1, class383 arg2, byte arg3, boolean arg4) {
        field3483++;
        int var5 = arg2.field5431;
        if (arg2.field5580 == 0) {
            arg2.field5431 = arg2.field5493;
        } else if (arg2.field5580 == 1) {
            arg2.field5431 = arg0 - arg2.field5493;
        } else if (arg2.field5580 == 2) {
            arg2.field5431 = arg2.field5493 * arg0 >> 14;
        } else if (arg2.field5580 == 3) {
            if (arg2.field5488 == 2) {
                arg2.field5431 = (arg2.field5493 - 1) * arg2.field5425 + arg2.field5493 * 32;
            } else if (arg2.field5488 == 7) {
                arg2.field5431 = (arg2.field5493 - 1) * arg2.field5425 + arg2.field5493 * 115;
            }
        }
        int var6 = arg2.field5491;
        if (arg2.field5541 == 0) {
            arg2.field5491 = arg2.field5454;
        } else if (arg2.field5541 == 1) {
            arg2.field5491 = arg1 - arg2.field5454;
        } else if (arg2.field5541 == 2) {
            arg2.field5491 = arg2.field5454 * arg1 >> 14;
        } else if (arg2.field5541 == 3) {
            if (arg2.field5488 == 2) {
                arg2.field5491 = (arg2.field5454 - 1) * arg2.field5592 + arg2.field5454 * 32;
            } else if (arg2.field5488 == 7) {
                arg2.field5491 = arg2.field5454 * 12 + ((arg2.field5454 - 1) * arg2.field5592);
            }
        }
        if (arg2.field5580 == 4) {
            arg2.field5431 = arg2.field5491 * arg2.field5438 / arg2.field5597;
        }
        if (arg2.field5541 == 4) {
            arg2.field5491 = arg2.field5597 * arg2.field5431 / arg2.field5438;
        }
        if (arg3 > -126) {
            field3487 = 23;
        }
        if (class280.field3829 && (client.method1119(arg2).field3612 != 0 || arg2.field5488 == 0)) {
            if (arg2.field5491 < 5 && arg2.field5431 < 5) {
                arg2.field5491 = 5;
                arg2.field5431 = 5;
            } else {
                if (arg2.field5491 <= 0) {
                    arg2.field5491 = 5;
                }
                if (arg2.field5431 <= 0) {
                    arg2.field5431 = 5;
                }
            }
        }
        if (arg2.field5480 == 1337) {
            class359.field5051 = arg2;
        }
        if (arg4 && arg2.field5602 != null && arg2.field5431 != var5 || arg2.field5491 != var6) {
            class410 var7 = new class410();
            var7.field5946 = arg2;
            var7.field5961 = arg2.field5602;
            class5.field76.method1301(50, var7);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIII)V", line = 159)
    public class254(int arg0, int arg1, int arg2, int arg3) {
        this.field3488 = arg2;
        this.field3481 = arg0;
        this.field3490 = arg1;
        this.field3491 = arg3;
    }
}
