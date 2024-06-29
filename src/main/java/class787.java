import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class787 extends class214 {

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Z")
    public static boolean field10808 = false;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field10804 = 0;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field10803;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field10805;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field10811;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field10812;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIII)V", line = 4)
    public class787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field2810 = arg2;
        super.field2813 = (byte) arg3;
        super.field2802 = arg0;
        super.field2815 = arg1;
        super.field2809 = (byte) arg4;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V", line = 17)
    public final void method127(int arg0) {
        if (arg0 != -13127) {
            field10804 = -32;
        }
        ++field10810;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIIIII)I", line = 29)
    public static final int method4311(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            return 125;
        } else {
            if (~(1 & arg2) == -2) {
                int var7 = arg0;
                arg0 = arg3;
                arg3 = var7;
            }
            ++field10809;
            int var8 = arg6 & 3;
            if (~var8 == -1) {
                return arg5;
            } else if (var8 == 1) {
                return -arg0 + 1 + -arg4 + 7;
            } else {
                return var8 == 2 ? -arg3 - -1 + -arg5 + 7 : arg4;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[Luaa;)I", line = 59)
    public final int method1388(byte arg0, class127[] arg1) {
        if (arg0 > -78) {
            field10808 = false;
        }
        ++field10812;
        return this.method1385(super.field2810 >> class478.field6717, (byte) -62, arg1, super.field2802 >> class478.field6717);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z", line = 70)
    public final boolean method126(byte arg0) {
        ++field10813;
        if (arg0 != -34) {
            this.method1389((class66) null, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)Z", line = 82)
    public final boolean method1383(int arg0) {
        int var2 = -124 % ((-48 - arg0) / 41);
        ++field10803;
        return class408.field5778[(super.field2802 >> class478.field6717) + -class130.field1787 + class278.field4025][(super.field2810 >> class478.field6717) + -class468.field6610 - -class278.field4025];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 99)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        ++field10807;
        if (arg2 == -103) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)I", line = 115)
    public static final int method4312(int arg0, int arg1, int arg2, int arg3) {
        ++field10805;
        int var4 = 255 - arg0;
        int var5 = ((16711935 & arg1) * arg0 & -16711936 | arg2 & (arg1 & 65280) * arg0) >>> 8;
        return (((16711935 & arg3) * var4 & -16711936 | 16711680 & (arg3 & 65280) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;Z)Z", line = 129)
    public final boolean method1389(class66 arg0, boolean arg1) {
        if (!arg1) {
            this.method129(17, (class214) null, (byte) 125, -64, -127, (class66) null, true);
        }
        ++field10806;
        class511 var3 = class268.method1788(super.field2813, super.field2802 >> class478.field6717, super.field2810 >> class478.field6717);
        return var3 != null && var3.field7126.field7456 ? class769.method4235(super.field2813, super.field2802 >> class478.field6717, var3.field7126.method774((byte) 115) + this.method774((byte) 115), (byte) 105, super.field2810 >> class478.field6717) : class482.method2835(-42, super.field2813, super.field2802 >> class478.field6717, super.field2810 >> class478.field6717);
    }
}
