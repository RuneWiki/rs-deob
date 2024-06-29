import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class675 extends class125 {

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Lqp;")
    public static class715 field9602 = new class715(16);

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Lfba;")
    public static class348 field9603 = new class348(260);

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "Z")
    public static boolean field9608 = false;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "Ldv;")
    public static class86 field9607;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field9605;
        if (class699.method3927(arg1, (byte) 20)) {
            if (super.field1733.field7975.method3773(-105) && !class330.method2030(super.field1733.field7975.method3775(false), -14)) {
                return 3;
            }
            if (super.field1733.field7968.method2653(false) == 1) {
                return 3;
            }
        }
        if (arg1 == 3) {
            return 3;
        } else if (class699.method3927(arg1, (byte) 20)) {
            return 2;
        } else {
            return !arg0 ? 15 : 1;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field9600;
        super.field1732 = arg1;
        if (arg0 >= -32) {
            this.method155(true, -101);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)Lnf;")
    public static final class19 method3833(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5427;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field9601;
        if (this.method3837(-120)) {
            if (super.field1733.field7975.method3773(72) && !class330.method2030(super.field1733.field7975.method3775(false), -53)) {
                super.field1732 = 1;
            }
            if (~super.field1733.field7968.method2653(false) == -2) {
                super.field1732 = 1;
            }
        }
        if (super.field1732 == 3) {
            super.field1732 = 2;
        }
        if (!arg0) {
            field9603 = null;
        }
        if (~super.field1732 > -1 || super.field1732 > 3) {
            super.field1732 = this.method158((byte) -125);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
    public final boolean method3834(int arg0) {
        if (arg0 != -7558) {
            field9608 = false;
        }
        ++field9599;
        return true;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(Z)I")
    public final int method3835(boolean arg0) {
        ++field9598;
        if (arg0) {
            this.method155(false, 64);
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILgp;)V")
    public class675(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field9604;
        int var2 = 37 % ((arg0 - -63) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
    public static void method3836(int arg0) {
        if (arg0 == 260) {
            field9603 = null;
            field9607 = null;
            field9602 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)Z")
    public final boolean method3837(int arg0) {
        ++field9606;
        if (arg0 > -92) {
            this.method158((byte) 2);
        }
        return class699.method3927(super.field1732, (byte) 20);
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lgp;)V")
    public class675(class549 arg0) {
        super(arg0);
    }
}
