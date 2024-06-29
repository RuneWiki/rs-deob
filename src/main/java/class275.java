import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class275 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field3718 = 0;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field3719 = 0;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
    private boolean field3728 = false;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3713 = -50;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field3730 = -1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "J")
    public long field3720;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lam;")
    public static class286 field3712;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lbl;")
    public static class54[] field3707;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltq;BI)V")
    private final void method1513(class250 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3725 = arg0.method1374(-2);
        } else if (arg2 == 2) {
            arg0.method1350(31351);
        } else if (arg2 == 3) {
            this.field3717 = arg0.method1359(arg1 ^ 0x8C);
            this.field3723 = arg0.method1359(255);
            this.field3722 = arg0.method1359(255);
        } else if (arg2 == 4) {
            this.field3714 = arg0.method1350(31351);
            this.field3708 = arg0.method1359(255);
        } else if (arg2 == 6) {
            this.field3715 = arg0.method1350(31351);
        } else if (arg2 == 8) {
            this.field3718 = 1;
        } else if (arg2 == 9) {
            this.field3719 = 1;
        } else if (arg2 == 10) {
            this.field3728 = true;
        }
        field3710++;
        if (arg1 != 115) {
            this.method1517(false);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lnk;")
    public static final class206 method1514(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        return var3 == null || var3.field1135 == null ? null : var3.field1135;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method1515(boolean arg0) {
        field3712 = null;
        field3707 = null;
        if (arg0) {
            method1514(13, 102, -49);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltq;I)V")
    public final void method1516(class250 arg0, int arg1) {
        field3711++;
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                if (arg1 <= 11) {
                    field3707 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1513(arg0, (byte) 115, var3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public final void method1517(boolean arg0) {
        field3724++;
        this.field3709 = class356.field5025[this.field3725 << 3];
        if (!arg0) {
            field3712 = null;
        }
        this.field3726 = (int) Math.sqrt((double) (this.field3717 * this.field3717 + (this.field3723 * this.field3723 + (this.field3722 * this.field3722))));
        if (this.field3708 == 0) {
            this.field3708 = 1;
        }
        if (this.field3714 == 0) {
            this.field3720 = 2147483647L;
        } else if (this.field3714 == 1) {
            this.field3720 = (long) (this.field3726 * 8 / this.field3708);
            this.field3720 *= this.field3720;
        } else if (this.field3714 == 2) {
            this.field3720 = (long) (this.field3726 * 8 / this.field3708);
        }
        if (this.field3728) {
            this.field3726 *= -1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method1518(int arg0, int arg1, byte arg2, String arg3, String arg4, String arg5) {
        field3727++;
        class418.method2595(0, arg5, arg3, arg1, arg0, arg4, -1, (String) null);
        if (arg2 != -107) {
            field3706 = -118;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZFIIBIII)[I")
    public static final int[] method1519(boolean arg0, float arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3716++;
        int[] var8 = new int[arg6];
        class125 var9 = new class125();
        var9.field1606 = (int) (arg1 * 4096.0F);
        var9.field1612 = arg3;
        var9.field1609 = arg0;
        var9.field1605 = arg2;
        var9.field1608 = arg7;
        var9.field1602 = arg5;
        var9.method120(false);
        class345.method2022(arg6, 1, true);
        var9.method678(-7126, var8, 0);
        return arg4 >= -113 ? null : var8;
    }
}
