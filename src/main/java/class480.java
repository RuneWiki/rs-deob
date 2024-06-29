import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class480 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field7042 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "F")
    public static float field7041;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
    public static final int method2800(int arg0) {
        field7038++;
        if (class680.field9649 == null) {
            if (arg0 != 32032) {
                method2801(7, 54, -94);
            }
            return class354.field4637 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lkv;")
    public static final class244 method2801(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3697;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lkfa;I)V")
    public static final void method2802(class549 arg0, int arg1) {
        if (arg1 == 16751) {
            class334.field4314.method3467(arg0.method3105((byte) -21), true);
            field7045++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
    public static final void method2803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1) {
            field7041 = -0.75058395F;
        }
        if (arg2 - arg0 >= class326.field4246 && (arg2 + arg0) <= class163.field1942 && class58.field602 <= arg3 - arg0 && (arg0 + arg3) <= class501.field7217) {
            class378.method2073(arg4, arg2, (byte) 116, arg3, arg0);
        } else {
            class638.method3587(arg0, arg4, arg3, arg2, (byte) 90);
        }
        field7040++;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I")
    public static final int method2804(int arg0, int arg1, int arg2) {
        field7044++;
        if (arg1 == 1 || arg1 == 3) {
            return class674.field9570[arg2 & 0x3];
        } else {
            if (arg0 != 1) {
                method2804(6, 30, -84);
            }
            return class135.field1535[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
    public static final boolean method2805(int arg0, int arg1) {
        field7039++;
        if (arg1 != 2) {
            field7042 = -76;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }
}
