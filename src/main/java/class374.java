import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class374 extends class435 {

    @OriginalMember(owner = "client!he", name = "A", descriptor = "S")
    public short field4794;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[Z")
    public static boolean[] field4798 = new boolean[100];

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2149(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field4798 = null;
        }
        ++field4799;
        return ~(arg1 & 24) != -1 | (544 & arg1) == 544;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lrg;ILrg;)V", line = 19)
    public static final void method2150(class644 arg0, int arg1, class644 arg2) {
        ++field4800;
        if (arg1 <= -33) {
            if (arg0.field8926 != null) {
                arg0.method3615(35);
            }
            arg0.field8921 = arg2;
            arg0.field8926 = arg2.field8926;
            arg0.field8926.field8921 = arg0;
            arg0.field8921.field8926 = arg0;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V", line = 37)
    public class374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5796 = (byte) arg3;
        super.field5797 = arg2;
        super.field5793 = (byte) arg4;
        super.field5800 = arg1;
        this.field4794 = (short) arg5;
        super.field5801 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(B)V", line = 50)
    public static void method2151(byte arg0) {
        if (arg0 == -109) {
            field4798 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(ILha;)Z", line = 60)
    public final boolean method918(int arg0, class60 arg1) {
        ++field4797;
        if (arg0 != -5) {
            method2149(-106, -101, 53);
        }
        return class614.method3438(super.field5801 >> class480.field6531, super.field5797 >> class480.field6531, super.field5793, arg0 + -92, this);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([Llaa;Z)I", line = 73)
    public final int method916(class123[] arg0, boolean arg1) {
        ++field4801;
        int var3 = super.field5801 >> class480.field6531;
        int var4 = super.field5797 >> class480.field6531;
        int var5 = 0;
        if (~class428.field5737 == ~var3) {
            ++var5;
        } else if (class428.field5737 < var3) {
            var5 += 2;
        }
        if (class216.field2924 != var4) {
            if (class216.field2924 > var4) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class396.field5061[var5];
        if (~(this.field4794 & var6) != -1) {
            return this.method2477(var3, var4, 38, arg0);
        } else if (this.field4794 == 1 && var3 > 0) {
            return this.method2477(var3 + -1, var4, 89, arg0);
        } else if (this.field4794 == 4 && ~var3 >= ~class289.field3784) {
            return this.method2477(var3 + 1, var4, 82, arg0);
        } else if (this.field4794 == 8 && var4 > 0) {
            return this.method2477(var3, var4 + -1, -93, arg0);
        } else if (~this.field4794 == -3 && ~class463.field6223 <= ~var4) {
            return this.method2477(var3, var4 - -1, -82, arg0);
        } else if (this.field4794 == 16 && var3 > 0 && class463.field6223 >= var4) {
            return this.method2477(var3 + -1, var4 - -1, -78, arg0);
        } else {
            if (!arg1) {
                this.method916((class123[]) null, true);
            }
            if (this.field4794 == 32 && ~var3 >= ~class289.field3784 && class463.field6223 >= var4) {
                return this.method2477(var3 - -1, var4 + 1, -114, arg0);
            } else if (~this.field4794 == -129 && var3 > 0 && ~var4 < -1) {
                return this.method2477(var3 + -1, var4 + -1, -68, arg0);
            } else if (~this.field4794 == -65 && var3 <= class289.field3784 && var4 > 0) {
                return this.method2477(var3 + 1, var4 + -1, 113, arg0);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Z", line = 160)
    public final boolean method914(byte arg0) {
        if (arg0 != 31) {
            return true;
        } else {
            ++field4795;
            return class449.field5945[(super.field5801 >> class480.field6531) + -class428.field5737 + class593.field8294][(super.field5797 >> class480.field6531) + -class216.field2924 - -class593.field8294];
        }
    }
}
