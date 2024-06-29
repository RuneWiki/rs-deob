import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class357 extends class409 {

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Lhj;")
    public static class596 field4423 = new class596(19, -1);

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZIB)V", line = 5)
    public final void method681(int arg0, boolean arg1, int arg2, byte arg3) {
        class363.field4526.method633(arg0 - 2, arg2, super.field5359.field7694 + 4, super.field5359.field7703 + 2, ((class519) super.field5359).field7326, 0);
        ++field4427;
        if (arg3 >= -52) {
            field4423 = null;
        }
        class363.field4526.method633(arg0 + -1, arg2 + 1, super.field5359.field7694 + 2, super.field5359.field7703, 0, 0);
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lbt;Lbt;Lew;)V", line = 18)
    public class357(class48 arg0, class48 arg1, class519 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZI)V", line = 21)
    public static final void method2091(int arg0, int arg1, boolean arg2, int arg3) {
        ++field4426;
        if (~arg1 <= -8001 && ~arg1 >= -48001) {
            if (arg3 != -2425) {
                field4423 = null;
            }
            class270.field3189 = arg2;
            class140.field1752 = arg0;
            class478.field6632 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIILkg;II)V", line = 42)
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, class287 arg4, int arg5, int arg6) {
        class343.method2035(arg4.field813, 0, arg4.field823, arg2, arg6, arg4.field808, (byte) -23, arg3, arg1, arg5);
        if (arg0 != -7087) {
            method2091(77, 37, false, 99);
        }
        ++field4424;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZII)V", line = 54)
    public final void method680(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != -30315) {
            method2094(120);
        }
        ++field4428;
        int var5 = this.method2450((byte) 114) * super.field5359.field7694 / 10000;
        class363.field4526.method645(arg0, arg3 + 2, var5, super.field5359.field7703 - 2, ((class519) super.field5359).field7330, 0);
        class363.field4526.method645(arg0 - -var5, arg3 + 2, -var5 + super.field5359.field7694, super.field5359.field7703 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lmd;", line = 68)
    public static final class570 method2093(int arg0) {
        if (arg0 != 1) {
            field4423 = null;
        }
        ++field4429;
        return class237.method1445(1, arg0 + 127);
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V", line = 81)
    public static void method2094(int arg0) {
        field4423 = null;
        if (arg0 < 71) {
            field4423 = null;
        }
    }
}
