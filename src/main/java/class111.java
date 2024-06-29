import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class111 extends class134 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "S")
    public static short field1473 = 256;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)I")
    public final int method746(byte arg0) {
        ++field1478;
        if (arg0 < 119) {
            this.method60((byte) -70);
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        int var3 = 62 % ((-26 - arg0) / 41);
        ++field1475;
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z")
    public static final boolean method747(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            return true;
        } else {
            ++field1476;
            return class257.method1546(arg1, arg2 ^ -15849, arg0) & class247.method1482(arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return -63;
        } else {
            ++field1469;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lkda;)V")
    public class111(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILkda;)V")
    public class111(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field1470;
        if (arg1 != 29053) {
            this.method55(-113, 77);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIIII)V")
    public static final void method748(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1472;
        if (~class122.field1604 >= ~arg4 && class165.field2070 >= arg1 && ~arg5 <= ~class759.field10576 && class29.field238 >= arg6) {
            if (~arg3 == -2) {
                class38.method187(arg5, arg6, arg1, arg4, arg0, -10194);
            } else {
                class48.method283(arg5, arg1, arg3, arg0, arg6, arg4, true);
            }
        } else if (~arg3 != -2) {
            class394.method2295(false, arg4, arg0, arg5, arg3, arg1, arg6);
        } else {
            class194.method1078(-31085, arg6, arg4, arg5, arg1, arg0);
        }
        if (arg2 != -51) {
            field1473 = 74;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        ++field1474;
        if (arg0 < 118) {
            method748(5, 122, (byte) 12, -14, -80, 53, -39);
        }
        if (super.field1708 < 0 || ~super.field1708 < -5) {
            super.field1708 = this.method58(0);
        }
    }
}
