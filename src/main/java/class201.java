import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class201 extends class295 {

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "S")
    public short field2850;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field2845 = -1;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    public static int field2849 = 0;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIZZ)V")
    public static final void method1321(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        ++field2843;
        class456.method2603(arg0, arg3, class362.field4777.length + -1, arg4, arg1, (byte) -88, arg2);
        class209.field2949 = null;
        class474.field6529 = 0;
    }

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "(B)Z")
    public final boolean method1322(byte arg0) {
        ++field2846;
        if (arg0 != -54) {
            this.method1323((class186[]) null, -10);
        }
        return class45.method377(super.field4050, -19539, super.field4042 >> class588.field8259, super.field4047 >> class588.field8259, this);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([Ltw;I)I")
    public final int method1323(class186[] arg0, int arg1) {
        ++field2844;
        int var3 = super.field4042 >> class588.field8259;
        int var4 = super.field4047 >> class588.field8259;
        int var5 = 0;
        if (~class167.field2435 != ~var3) {
            if (~var3 < ~class167.field2435) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class353.field4699 == ~var4) {
            var5 += 3;
        } else if (class353.field4699 > var4) {
            var5 += 6;
        }
        int var6 = class567.field8000[var5];
        if ((var6 & this.field2850) != 0) {
            return this.method1798(var4, arg0, var3, -9609);
        } else if (this.field2850 == 1 && ~var3 < -1) {
            return this.method1798(var4, arg0, var3 + -1, -9609);
        } else if (this.field2850 == 4 && var3 <= class335.field4511) {
            return this.method1798(var4, arg0, var3 + 1, -9609);
        } else if (arg1 <= 69) {
            return -39;
        } else if (~this.field2850 == -9 && var4 > 0) {
            return this.method1798(var4 + -1, arg0, var3, -9609);
        } else if (this.field2850 == 2 && ~class643.field8878 <= ~var4) {
            return this.method1798(var4 + 1, arg0, var3, -9609);
        } else if (this.field2850 == 16 && var3 > 0 && class643.field8878 >= var4) {
            return this.method1798(var4 + 1, arg0, var3 + -1, -9609);
        } else if (~this.field2850 == -33 && var3 <= class335.field4511 && ~class643.field8878 <= ~var4) {
            return this.method1798(var4 + 1, arg0, var3 + 1, -9609);
        } else if (~this.field2850 == -129 && var3 > 0 && var4 > 0) {
            return this.method1798(var4 + -1, arg0, var3 - 1, -9609);
        } else if (this.field2850 == 64 && ~class335.field4511 <= ~var3 && ~var4 < -1) {
            return this.method1798(var4 + -1, arg0, var3 + 1, -9609);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)Z")
    public final boolean method1324(int arg0) {
        if (arg0 >= -104) {
            this.method1323((class186[]) null, -3);
        }
        ++field2848;
        return class147.field2093[(super.field4042 >> class588.field8259) + class36.field428 - class167.field2435][(super.field4047 >> class588.field8259) + -class353.field4699 + class36.field428];
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIII)V")
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4053 = (byte) arg3;
        super.field4047 = arg2;
        super.field4050 = (byte) arg4;
        super.field4042 = arg0;
        super.field4052 = arg1;
        this.field2850 = (short) arg5;
    }
}
