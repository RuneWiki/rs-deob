import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class199 extends class450 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[Lhu;")
    public static class133[] field2988;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field2990;
        int var2 = super.field6171.method1680(-18640).method1231(true);
        if (~var2 > -97) {
            super.field6170 = 0;
        }
        if (super.field6170 > 1 && var2 < 128) {
            super.field6170 = 1;
        }
        if (super.field6170 > 2 && var2 < 192) {
            super.field6170 = 2;
        }
        if (super.field6170 < 0 || ~super.field6170 < -4) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            field2988 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z")
    public final boolean method1340(int arg0) {
        ++field2996;
        int var2 = super.field6171.method1680(-18640).method1231(true);
        if (arg0 != 260) {
            this.method75(99, 127);
        }
        return ~var2 <= -97;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)I")
    public final int method1341(boolean arg0) {
        if (!arg0) {
            return 12;
        } else {
            ++field2994;
            return super.field6170;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field2989;
        int var3 = super.field6171.method1680(-18640).method1231(true);
        if (arg0 != 0) {
            field2988 = null;
        }
        if (var3 < 96) {
            return 3;
        } else if (arg1 > 1 && var3 < 128) {
            return 3;
        } else {
            return ~arg1 < -4 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(ILup;)V")
    public class199(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field2988 = null;
        if (arg0 != -30504) {
            method1343(-111, 12, 119);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field2991;
        if (arg0) {
            this.method1341(false);
        }
        return 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (!arg0) {
            field2993 = 68;
        }
        ++field2992;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lup;)V")
    public class199(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Z")
    public static final boolean method1343(int arg0, int arg1, int arg2) {
        if (arg1 != 192) {
            field2993 = 35;
        }
        ++field2995;
        return class613.method3335(5, arg2, arg0) & class374.method2189(arg2, arg0, arg1 + -192);
    }
}
