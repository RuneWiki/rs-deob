import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class280 extends class212 {

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Lej;")
    public static class124 field3928 = new class124(25, 3);

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "Lsj;")
    public static class460 field3931 = new class460("game4", 3);

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Lej;")
    public static class124 field3933 = new class124(78, 16);

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "[Lmi;")
    public static class496[] field3932;

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(ILdh;)V", line = 3)
    public class280(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 12)
    public final void method419(int arg0, int arg1) {
        ++field3924;
        int var3 = -123 % ((82 - arg0) / 35);
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Z", line = 24)
    public final boolean method1847(int arg0) {
        ++field3926;
        if (super.field3004.method2061(-122)) {
            return false;
        } else {
            if (arg0 < 85) {
                this.method1849(117);
            }
            return super.field3004.method2058(674) == class456.field6431;
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 43)
    public static void method1848(int arg0) {
        if (arg0 != -16211) {
            field3933 = null;
        }
        field3931 = null;
        field3928 = null;
        field3932 = null;
        field3933 = null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I", line = 56)
    public final int method417(int arg0, int arg1) {
        ++field3925;
        if (super.field3004.method2061(-114)) {
            return 3;
        } else if (super.field3004.method2058(674) == class456.field6431) {
            if (~arg1 == -1) {
                if (super.field3004.field4444.method1557(-32350) == 1) {
                    return 2;
                }
                if (~super.field3004.field4432.method887(arg0 + -32353) == -2) {
                    return 2;
                }
                if (~super.field3004.field4456.method3536(-32350) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            if (arg0 != 3) {
                this.method422(57);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 89)
    public final void method418(boolean arg0) {
        ++field3930;
        if (arg0) {
            field3928 = null;
        }
        if (super.field3004.method2058(674) != class456.field6431) {
            super.field3006 = 1;
        } else if (super.field3004.method2061(-125)) {
            super.field3006 = 0;
        }
        if (super.field3006 != 0 && super.field3006 != 1) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I", line = 110)
    public final int method1849(int arg0) {
        ++field3929;
        if (arg0 != -32350) {
            this.method417(-83, -18);
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ldh;)V", line = 122)
    public class280(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I", line = 128)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field3933 = null;
        }
        ++field3927;
        return 1;
    }
}
