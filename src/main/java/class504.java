import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class504 extends class545 {

    @OriginalMember(owner = "client!ria", name = "F", descriptor = "I")
    public int field7018;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
    public int field7017;

    @OriginalMember(owner = "client!ria", name = "B", descriptor = "I")
    public int field7014;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
    public int field7007;

    @OriginalMember(owner = "client!ria", name = "D", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "Luia;")
    public static class274 field7006 = new class274(0, -1);

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ria", name = "A", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ria", name = "C", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI)Z")
    public static final boolean method3034(byte arg0, int arg1) {
        if (arg0 != 80) {
            field7008 = 79;
        }
        field7010++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)I")
    public static final int method3035(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field7015++;
        if (arg0 != 29429) {
            method3037(null, 90, null);
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lrg;Lal;IIIIIIIIIIIII)V")
    public class504(class557 arg0, class125 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7018 = arg9;
        this.field7009 = arg13;
        this.field7017 = arg10;
        this.field7014 = arg12;
        this.field7007 = arg14;
        this.field7016 = arg11;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(Z)V")
    public static void method3036(boolean arg0) {
        field7006 = null;
        if (arg0) {
            method3038((byte) 80, null);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lbe;ILha;)I")
    public static final int method3037(class230 arg0, int arg1, class548 arg2) {
        field7011++;
        if (arg0.field3113 != arg1) {
            return arg0.field3113;
        }
        if (arg0.field3125 != -1) {
            class239 var3 = arg2.field7623.method521(arg0.field3125, arg1 ^ 0xFFFFFF88);
            if (!var3.field3562) {
                return var3.field3566;
            }
        }
        return arg0.field3114;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Lww;")
    public class288 method1206(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field7012++;
            return class63.field991;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLuv;)V")
    public static final void method3038(byte arg0, class755 arg1) {
        if (arg1.field10416 == 5 && arg1.field10441 != -1) {
            class540.method3198(0, class129.field1802, arg1);
        }
        if (arg0 != 93) {
            method3038((byte) 71, null);
        }
        field7013++;
    }
}
