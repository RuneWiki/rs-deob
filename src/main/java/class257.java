import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class257 extends class432 {

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field3600 = -1;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public final void method1597(int arg0, int arg1, int arg2) {
        if (arg2 != -20714) {
            this.field3602 = -36;
        }
        ++field3597;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIII)V")
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3595 = arg2;
        this.field3602 = arg3;
        this.field3601 = arg0;
        this.field3596 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V")
    public final void method1598(boolean arg0, int arg1, int arg2) {
        ++field3603;
        if (!arg0) {
            this.field3596 = -58;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static final void method1599(int arg0) {
        class81.field1226 = true;
        if (arg0 != -6548) {
            method1599(12);
        }
        ++field3594;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLld;)I")
    public static final int method1600(byte arg0, class196 arg1) {
        ++field3598;
        class127 var2 = arg1.field2789;
        if (var2.field1780 != null) {
            var2 = var2.method767(class320.field4376, (byte) 58);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 <= 66) {
            field3600 = -38;
        }
        int var3 = var2.field1774;
        class318 var4 = arg1.method517(-106);
        if (!arg1.field1127) {
            if (~arg1.field1089 != ~var4.field4348 && arg1.field1089 != var4.field4312 && ~arg1.field1089 != ~var4.field4352 && ~arg1.field1089 != ~var4.field4317) {
                if (~arg1.field1089 == ~var4.field4350 || ~arg1.field1089 == ~var4.field4357 || arg1.field1089 == var4.field4329 || arg1.field1089 == var4.field4315) {
                    var3 = var2.field1758;
                }
            } else {
                var3 = var2.field1801;
            }
        } else {
            var3 = var2.field1772;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V")
    public final void method1601(byte arg0, int arg1, int arg2) {
        ++field3599;
        if (arg0 > -60) {
            this.method1598(false, -125, 1);
        }
        int var4 = this.field3601 * arg2 >> 12;
        int var5 = this.field3595 * arg2 >> 12;
        int var6 = this.field3596 * arg1 >> 12;
        int var7 = this.field3602 * arg1 >> 12;
        class436.method2533((byte) 126, var4, var6, super.field5950, var7, var5);
    }
}
