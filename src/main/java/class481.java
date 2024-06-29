import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public abstract class class481 extends class214 {

    @OriginalMember(owner = "client!iga", name = "B", descriptor = "S")
    public short field6752;

    @OriginalMember(owner = "client!iga", name = "y", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!iga", name = "A", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lha;Z)Z")
    public final boolean method1389(class66 arg0, boolean arg1) {
        ++field6751;
        if (!arg1) {
            this.field6752 = -37;
        }
        return class761.method4193(super.field2809, (byte) -41, this, super.field2810 >> class478.field6717, super.field2802 >> class478.field6717);
    }

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "(I)Z")
    public final boolean method1383(int arg0) {
        ++field6750;
        int var2 = -96 % ((-48 - arg0) / 41);
        return class408.field5778[(super.field2802 >> class478.field6717) + -class130.field1787 + class278.field4025][(super.field2810 >> class478.field6717) + -class468.field6610 - -class278.field4025];
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B[Luaa;)I")
    public final int method1388(byte arg0, class127[] arg1) {
        ++field6749;
        int var3 = super.field2802 >> class478.field6717;
        int var4 = super.field2810 >> class478.field6717;
        int var5 = 0;
        if (class130.field1787 != var3) {
            if (~class130.field1787 > ~var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class468.field6610 == var4) {
            var5 += 3;
        } else if (~class468.field6610 < ~var4) {
            var5 += 6;
        }
        int var6 = class31.field302[var5];
        if (arg0 >= -78) {
            return 67;
        } else if ((var6 & this.field6752) != 0) {
            return this.method1385(var4, (byte) -71, arg1, var3);
        } else if (~this.field6752 == -2 && ~var3 < -1) {
            return this.method1385(var4, (byte) -88, arg1, var3 + -1);
        } else if (this.field6752 == 4 && ~class196.field2540 <= ~var3) {
            return this.method1385(var4, (byte) -98, arg1, var3 + 1);
        } else if (~this.field6752 == -9 && var4 > 0) {
            return this.method1385(var4 + -1, (byte) -95, arg1, var3);
        } else if (this.field6752 == 2 && class247.field3229 >= var4) {
            return this.method1385(var4 + 1, (byte) -82, arg1, var3);
        } else if (this.field6752 == 16 && ~var3 < -1 && var4 <= class247.field3229) {
            return this.method1385(var4 + 1, (byte) -100, arg1, var3 + -1);
        } else if (this.field6752 == 32 && class196.field2540 >= var3 && class247.field3229 >= var4) {
            return this.method1385(var4 + 1, (byte) -86, arg1, var3 - -1);
        } else if (~this.field6752 == -129 && ~var3 < -1 && ~var4 < -1) {
            return this.method1385(var4 + -1, (byte) -127, arg1, var3 - 1);
        } else if (~this.field6752 == -65 && class196.field2540 >= var3 && var4 > 0) {
            return this.method1385(var4 + -1, (byte) -60, arg1, var3 + 1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(IIIIII)V")
    public class481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2815 = arg1;
        super.field2813 = (byte) arg3;
        super.field2810 = arg2;
        this.field6752 = (short) arg5;
        super.field2809 = (byte) arg4;
        super.field2802 = arg0;
    }
}
