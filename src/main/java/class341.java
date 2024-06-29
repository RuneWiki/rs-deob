import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class341 {

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    private int field4730 = 0;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "Lmo;")
    private class482 field4735;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "Leda;")
    public static class116 field4734 = new class116(101, 28);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "Ltv;")
    private class435 field4737;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Ltv;")
    public final class435 method2047(int arg0) {
        this.field4730 = 0;
        if (arg0 < 77) {
            this.field4735 = null;
        }
        field4736++;
        return this.method2050(0);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)V")
    public static final void method2048(int arg0, byte arg1) {
        field4729++;
        if (arg1 != 59) {
            method2053(34);
        }
        class449 var2 = class611.method3463(arg0, (byte) -113, 9);
        var2.method2614(arg1 ^ 0x4C);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)I")
    public static final int method2049(int arg0) {
        if (arg0 != 8496) {
            return -6;
        }
        field4733++;
        if (class324.field4519) {
            return 6;
        } else if (class354.field4954 == null) {
            return 0;
        } else {
            int var1 = class354.field4954.field9544;
            if (class42.method346(100, var1)) {
                return 1;
            } else if (class586.method3382(var1, (byte) 45)) {
                return 2;
            } else if (class140.method1092(var1, arg0 - 8545)) {
                return 3;
            } else if (class642.method3609((byte) 100, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)Ltv;")
    public final class435 method2050(int arg0) {
        field4732++;
        if (this.field4730 > 0 && this.field4735.field6891[this.field4730 - 1] != this.field4737) {
            class435 var2 = this.field4737;
            this.field4737 = var2.field6259;
            return var2;
        }
        while (this.field4730 < this.field4735.field6889) {
            class435 var3 = this.field4735.field6891[this.field4730++].field6259;
            if (this.field4735.field6891[this.field4730 - 1] != var3) {
                this.field4737 = var3.field6259;
                return var3;
            }
        }
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2051(int arg0, int arg1, byte arg2) {
        if (arg2 >= -80) {
            field4734 = null;
        }
        field4738++;
        boolean var3 = (arg0 & 0x37) == 0 ? class293.method1791(arg1, -1, arg0) : class673.method3810(arg1, 8192, arg0);
        return var3 | class541.method3184(arg1, (byte) 120, arg0) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lis;B)V")
    public static final void method2052(class101 arg0, byte arg1) {
        field4731++;
        if (class135.field2172 == arg0.field1638) {
            if (class103.field1708.field3848 == null) {
                arg0.field1621 = 0;
                arg0.field1598 = 0;
            } else {
                arg0.field1570 = 150;
                arg0.field1609 = (int) (Math.sin((double) class148.field2508 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1598 = class609.field8749;
                arg0.field1527 = 5;
                arg0.field1621 = class642.method3611(0, class103.field1708.field3848);
                arg0.field1499 = class103.field1708.field2359;
                arg0.field1603 = class103.field1708.field2425;
                arg0.field1551 = class103.field1708.field2414;
                arg0.field1545 = 0;
                class606 var2 = arg0.field1603 == -1 ? null : class480.field6871.method1417(-3585, arg0.field1603);
                if (var2 != null) {
                    class173.method1274(arg0.field1551, var2, false);
                }
            }
        } else if (arg1 < 34) {
            method2049(-17);
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
    public class341() {
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lmo;)V")
    public class341(class482 arg0) {
        this.field4735 = arg0;
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V")
    public static void method2053(int arg0) {
        field4734 = null;
        if (arg0 != 3) {
            field4734 = null;
        }
    }
}
