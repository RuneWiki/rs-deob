import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class644 extends class212 {

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field8869 = 0;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
    public final int method3656(int arg0) {
        if (arg0 != -32350) {
            field8869 = 42;
        }
        ++field8867;
        return super.field3006;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (super.field3004.method2058(674) == class204.field2938) {
            super.field3006 = 2;
        }
        if (!arg0) {
            ++field8863;
            if (~super.field3006 > -1 || ~super.field3006 < -3) {
                super.field3006 = this.method422(20014);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILkda;)V")
    public static final void method3657(int arg0, class390 arg1) {
        if (arg0 == -3) {
            if (!(arg1 instanceof class9)) {
                if (arg1 instanceof class598) {
                    class598 var2 = (class598) arg1;
                    class326.method2075((byte) 105, class58.field1147.field5926 != var2.field5926, var2);
                }
            } else {
                class9 var3 = (class9) arg1;
                if (var3.field126 != null) {
                    class227.method1596(class58.field1147.field5926 != var3.field5926, false, var3);
                }
            }
            ++field8870;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            return 3;
        } else {
            ++field8868;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(ILdh;)V")
    public class644(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        ++field8866;
        super.field3006 = arg1;
        int var3 = -54 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field8864;
        return arg0 != 20014 ? 70 : 1;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ldh;)V")
    public class644(class322 arg0) {
        super(arg0);
    }
}
