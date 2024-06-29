import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class156 extends class530 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lfg;")
    public static class436 field2134;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lah;)V")
    public class156(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static void method986(boolean arg0) {
        field2134 = null;
        if (!arg0) {
            field2134 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(ILah;)V")
    public class156(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field2135;
        if (super.field7418.method2253(-50)) {
            return 3;
        } else if (super.field7418.method2246(1) == class75.field1037) {
            if (arg0 == 0) {
                if (super.field7418.field5143.method656(0) == 1) {
                    return 2;
                }
                if (~super.field7418.field5130.method1257(0) == -2) {
                    return 2;
                }
                if (super.field7418.field5134.method2336(0) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            int var3 = 20 % ((63 - arg1) / 60);
            return 3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        ++field2130;
        super.field7419 = arg0;
        if (arg1 >= -38) {
            method987(false, 73);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public static final void method987(boolean arg0, int arg1) {
        ++field2129;
        if (~class674.field9500.field5144.method1058(0) == -1) {
            arg1 = -1;
        }
        if (class538.field7530 != arg1) {
            if (~arg1 != 0) {
                class754 var2 = class466.field6364.method1066(105, arg1);
                class320 var3 = var2.method4179(0);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class379.field5339.method3589(new Point(var2.field10471, var2.field10470), var3.method1865(), var3.method1866(), var3.method1863(), class438.field6016, 117);
                    class538.field7530 = arg1;
                }
            }
            if (!arg0) {
                field2134 = null;
            }
            if (arg1 == -1 && class538.field7530 != -1) {
                class379.field5339.method3589(new Point(), (int[]) null, -1, -1, class438.field6016, -27);
                class538.field7530 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (super.field7418.method2246(1) != class75.field1037) {
            super.field7419 = 1;
        } else if (super.field7418.method2253(-51)) {
            super.field7419 = 0;
        }
        ++field2128;
        if (!arg0) {
            field2134 = null;
        }
        if (~super.field7419 != -1 && ~super.field7419 != -2) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)Z")
    public final boolean method988(boolean arg0) {
        ++field2132;
        if (!arg0) {
            return true;
        } else if (super.field7418.method2253(-22)) {
            return false;
        } else {
            return super.field7418.method2246(1) == class75.field1037;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field2134 = null;
        }
        ++field2133;
        return 1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
    public final int method989(int arg0) {
        ++field2131;
        if (arg0 != 0) {
            field2134 = null;
        }
        return super.field7419;
    }
}
