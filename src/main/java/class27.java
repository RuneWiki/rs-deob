import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class27 extends class23 {

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "Lrh;")
    public static class118 field449 = new class118();

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "Llc;")
    public static class143 field452 = class66.method374(")1", -1);

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Llc;")
    public static class143 field451 = class66.method374("gelb:", -1);

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[[S")
    public static short[][] field453 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field454 = -1;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Z")
    public static final boolean method184(byte arg0, int arg1) {
        ++field446;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (arg0 > -12) {
                method187(-38, 49);
            }
            return arg1 < 129 || ~arg1 < -160;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field448;
        if (arg0 >= -13) {
            method186(-113, 62);
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            class275.method1812(var3, 0, class72.field1359, class31.field495[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static void method185(int arg0) {
        field452 = null;
        field449 = null;
        field453 = null;
        field451 = null;
        if (arg0 != 12) {
            field451 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Lvh;")
    public static final class43 method186(int arg0, int arg1) {
        ++field447;
        int var2 = arg1 & 65535;
        int var3 = arg1 >> 16;
        if (arg0 != 1341) {
            method184((byte) 28, 9);
        }
        if (class223.field4045[var3] == null || class223.field4045[var3][var2] == null) {
            boolean var4 = class47.method289((byte) -49, var3);
            if (!var4) {
                return null;
            }
        }
        return class223.field4045[var3][var2];
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)Z")
    public static final boolean method187(int arg0, int arg1) {
        if (arg1 != 57) {
            return true;
        } else {
            ++field450;
            return ~arg0 <= -49 && arg0 <= 57;
        }
    }
}
