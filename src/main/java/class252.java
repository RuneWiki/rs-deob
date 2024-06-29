import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class252 {

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[Ltia;")
    private class281[] field3731;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "J")
    private long field3728;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "Ltia;")
    private class281 field3732;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1685(int arg0) {
        field3725++;
        if (class526.field7216) {
            return 6;
        } else if (class788.field10852 == null) {
            return 0;
        } else {
            int var1 = class788.field10852.field4080;
            if (class99.method780(var1, (byte) -79)) {
                return 1;
            }
            if (arg0 > -110) {
                method1685(67);
            }
            if (class403.method2514((byte) 6, var1)) {
                return 2;
            } else if (class33.method236(var1, -1)) {
                return 3;
            } else if (class18.method146(var1, -13)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Ltia;", line = 44)
    public final class281 method1686(byte arg0) {
        field3726++;
        if (this.field3732 == null) {
            return null;
        } else if (arg0 == -79) {
            class281 var2 = this.field3731[(int) (this.field3728 & (long) (this.field3730 - 1))];
            while (this.field3732 != var2) {
                if (this.field3732.field4141 == this.field3728) {
                    class281 var3 = this.field3732;
                    this.field3732 = this.field3732.field4146;
                    return var3;
                }
                this.field3732 = this.field3732.field4146;
            }
            this.field3732 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ltia;BJ)V", line = 76)
    public final void method1687(class281 arg0, byte arg1, long arg2) {
        int var5 = -35 / ((-arg1 - 21) / 37);
        if (arg0.field4145 != null) {
            arg0.method1811(28064);
        }
        field3729++;
        class281 var6 = this.field3731[(int) (arg2 & (long) (this.field3730 - 1))];
        arg0.field4145 = var6.field4145;
        arg0.field4146 = var6;
        arg0.field4145.field4146 = arg0;
        arg0.field4141 = arg2;
        arg0.field4146.field4145 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IJ)Ltia;", line = 108)
    public final class281 method1688(int arg0, long arg1) {
        field3727++;
        this.field3728 = arg1;
        class281 var4 = this.field3731[(int) ((long) (this.field3730 - 1) & arg1)];
        for (this.field3732 = var4.field4146; this.field3732 != var4; this.field3732 = this.field3732.field4146) {
            if (this.field3732.field4141 == arg1) {
                class281 var5 = this.field3732;
                this.field3732 = this.field3732.field4146;
                return var5;
            }
        }
        if (arg0 != 5) {
            this.method1686((byte) 71);
        }
        this.field3732 = null;
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V", line = 144)
    public class252(int arg0) {
        this.field3731 = new class281[arg0];
        this.field3730 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class281 var3 = this.field3731[var2] = new class281();
            var3.field4145 = var3;
            var3.field4146 = var3;
        }
    }
}
