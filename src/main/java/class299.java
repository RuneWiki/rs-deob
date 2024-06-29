import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class299 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lnv;")
    private class417 field3718;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "J")
    public long field3724;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3717 = 1337;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lpia;")
    public static class94 field3720 = new class94(53, -1);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1768(byte arg0) {
        field3720 = null;
        if (arg0 < 52) {
            field3717 = -42;
        }
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3718.method2595(128, this.field3724);
        field3719++;
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIIILtp;)V")
    public static final void method1769(boolean arg0, int arg1, int arg2, int arg3, class532 arg4) {
        field3723++;
        int var5 = arg4.field7658;
        if (arg4.field7633 == 0) {
            arg4.field7658 = arg4.field7572;
        } else if (arg4.field7633 == 1) {
            arg4.field7658 = arg1 - arg4.field7572;
        } else if (arg4.field7633 == 2) {
            arg4.field7658 = arg4.field7572 * arg1 >> 14;
        }
        int var6 = -115 / ((50 - arg2) / 35);
        int var7 = arg4.field7573;
        if (arg4.field7614 == 0) {
            arg4.field7573 = arg4.field7692;
        } else if (arg4.field7614 == 1) {
            arg4.field7573 = arg3 - arg4.field7692;
        } else if (arg4.field7614 == 2) {
            arg4.field7573 = arg4.field7692 * arg3 >> 14;
        }
        if (arg4.field7633 == 4) {
            arg4.field7658 = arg4.field7643 * arg4.field7573 / arg4.field7601;
        }
        if (arg4.field7614 == 4) {
            arg4.field7573 = arg4.field7658 * arg4.field7601 / arg4.field7643;
        }
        if (class19.field164 && (client.method1779(arg4).field10498 != 0 || arg4.field7543 == 0)) {
            if (arg4.field7573 < 5 && arg4.field7658 < 5) {
                arg4.field7658 = 5;
                arg4.field7573 = 5;
            } else {
                if (arg4.field7658 <= 0) {
                    arg4.field7658 = 5;
                }
                if (arg4.field7573 <= 0) {
                    arg4.field7573 = 5;
                }
            }
        }
        if (field3717 == arg4.field7664) {
            class477.field6800 = arg4;
        }
        if (arg0 && arg4.field7605 != null && arg4.field7658 != var5 || arg4.field7573 != var7) {
            class622 var8 = new class622();
            var8.field8908 = arg4;
            var8.field8904 = arg4.field7605;
            class518.field7374.method1721((byte) 107, var8);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Lvba;")
    public static final class40 method1770(boolean arg0, int arg1) {
        field3722++;
        class40 var2 = (class40) class284.field3468.method3538((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class711.field10010.method2481(1, arg1, (byte) 126);
        class40 var4 = new class40();
        var4.field458 = arg1;
        if (var3 != null) {
            var4.method241(new class244(var3), -1);
        }
        var4.method244((byte) -14);
        if (var4.field453 == 2 && class436.field6353.method1754(!arg0, (long) arg1) == null) {
            class436.field6353.method1751(new class716(class391.field5396), 3970, (long) arg1);
            class552.field7916[class391.field5396++] = var4;
        }
        class284.field3468.method3537(66, (long) arg1, var4);
        if (!arg0) {
            field3717 = -112;
        }
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lnv;JI)V")
    public class299(class417 arg0, long arg1, int arg2) {
        this.field3718 = arg0;
        this.field3724 = arg1;
    }
}
