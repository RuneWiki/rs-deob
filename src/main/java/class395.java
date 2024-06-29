import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class395 {

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6147;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)Z")
    public static final boolean method2549(int arg0, int arg1) {
        field6142++;
        if (arg0 != 2) {
            field6147 = null;
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZI)I")
    public final int method2550(int arg0, boolean arg1, int arg2) {
        field6148++;
        int var4 = class259.field4147 > arg2 ? class259.field4147 : arg2;
        if (class203.field3293 == this) {
            return 0;
        } else if (class565.field8119 == this) {
            return var4 - arg0;
        } else if (class561.field8082 == this) {
            return (var4 - arg0) / 2;
        } else if (arg1) {
            return 0;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method2551(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -127) {
            return;
        }
        field6145++;
        if (arg2 >= arg6) {
            return;
        }
        int var7 = (arg2 + arg6) / 2;
        int var8 = arg2;
        class226 var9 = class231.field3683[var7];
        class231.field3683[var7] = class231.field3683[arg6];
        class231.field3683[arg6] = var9;
        for (int var10 = arg2; var10 < arg6; var10++) {
            if (class425.method2694(var9, arg3, false, arg0, class231.field3683[var10], arg1, arg4) <= 0) {
                class226 var11 = class231.field3683[var10];
                class231.field3683[var10] = class231.field3683[var8];
                class231.field3683[var8++] = var11;
            }
        }
        class231.field3683[arg6] = class231.field3683[var8];
        class231.field3683[var8] = var9;
        method2551(arg0, arg1, arg2, arg3, arg4, -128, var8 - 1);
        method2551(arg0, arg1, var8 + 1, arg3, arg4, -128, arg6);
    }

    @OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6143++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lob;II)Z")
    public static final boolean method2552(class686 arg0, int arg1, int arg2) {
        field6144++;
        class694.field9727.method502(arg0.field9623[arg1], arg0.field9617[arg1], arg0.field9619[arg1], class110.field1769);
        int var3 = class110.field1769[2];
        if (var3 < 50) {
            return false;
        } else {
            arg0.field9616[arg1] = (short) (class110.field1769[0] * class527.field7692 / var3 + class651.field9125);
            arg0.field9612[arg1] = (short) (class110.field1769[arg2] * class443.field6735 / var3 + class220.field3584);
            arg0.field9613[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public static void method2553(int arg0) {
        if (arg0 > 115) {
            field6147 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "([Lf;I)V")
    public static final void method2554(class702[] arg0, int arg1) {
        class615.field8741 = arg0.length;
        field6146++;
        class114.field1790 = new class702[class615.field8741 + arg1];
        class379.field5914 = new int[class615.field8741 + 10];
        class398.method2564(arg0, 0, class114.field1790, 0, class615.field8741);
        for (int var2 = 0; var2 < class615.field8741; var2++) {
            class379.field5914[var2] = class114.field1790[var2].method1079();
        }
        for (int var3 = class615.field8741; var3 < class114.field1790.length; var3++) {
            class379.field5914[var3] = 12;
        }
    }
}
