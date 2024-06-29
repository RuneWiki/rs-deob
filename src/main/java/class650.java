import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class650 extends class212 {

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field8936;
        if (arg0 != 20014) {
            return -71;
        } else if (!super.field3004.method2061(-109)) {
            return super.field3004.field4468.method1100((byte) -107) && class204.method1418(super.field3004.field4468.method1099(-32350), 5126) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILdh;)V")
    public class650(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (!arg0) {
            if (super.field3004.method2061(-68)) {
                super.field3006 = 2;
            }
            ++field8938;
            if (~super.field3006 > -1 || super.field3006 > 2) {
                super.field3006 = this.method422(20014);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)Z")
    public final boolean method3677(int arg0) {
        if (arg0 < 85) {
            return false;
        } else {
            ++field8937;
            return !super.field3004.method2061(-108);
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)I")
    public final int method3678(int arg0) {
        if (arg0 != -32350) {
            return 29;
        } else {
            ++field8941;
            return super.field3006;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method418(true);
        }
        ++field8939;
        return super.field3004.method2061(-109) ? 3 : 1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILin;)Loea;")
    public static final class597 method3679(int arg0, int arg1, int arg2, class91 arg3) {
        ++field8940;
        byte[] var4 = arg3.method863(-1860, arg0, arg1);
        if (arg2 >= -31) {
            method3679(65, -4, -97, (class91) null);
        }
        return var4 == null ? null : new class597(var4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        ++field8942;
        super.field3006 = arg1;
        int var3 = 7 % ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ldh;)V")
    public class650(class322 arg0) {
        super(arg0);
    }
}
