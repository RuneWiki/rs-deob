import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class31 extends class212 {

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field802 = -1;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field798;
        if (super.field3004.method2061(-93)) {
            return 3;
        } else if (super.field3004.field4432.method887(arg0 ^ -32351) == 0) {
            return 3;
        } else {
            if (arg0 != 3) {
                field802 = -111;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(ILdh;)V")
    public class31(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Ldh;)V")
    public class31(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (super.field3004.method2061(-82)) {
            super.field3006 = 0;
        }
        ++field797;
        if (~super.field3004.field4432.method887(-32350) == -1) {
            super.field3006 = 0;
        }
        if (arg0) {
            this.method419(-60, 72);
        }
        if (~super.field3006 > -1 || super.field3006 > 2) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        ++field799;
        int var3 = -93 % ((82 - arg0) / 35);
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)Z")
    public final boolean method420(int arg0) {
        ++field801;
        if (super.field3004.method2061(-127)) {
            return false;
        } else if (super.field3004.field4432.method887(-32350) == 0) {
            return false;
        } else {
            if (arg0 < 85) {
                this.method420(105);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)I")
    public final int method421(int arg0) {
        if (arg0 != -32350) {
            return 111;
        } else {
            ++field803;
            return super.field3006;
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field800;
        if (arg0 != 20014) {
            field802 = 100;
        }
        return 2;
    }
}
