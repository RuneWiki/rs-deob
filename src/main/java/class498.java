import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class498 extends class623 {

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
    public static boolean field7026 = false;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
    public static final boolean method2965(int arg0, int arg1, int arg2) {
        if (arg0 == 8236) {
            field7028++;
            return class542.method3188(arg1, (byte) -79, arg2) | (arg2 & 0x60000) != 0 || class599.method3409(arg2, arg1, 55) || class737.method4113(arg1, arg2, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
    public abstract boolean method1989(int arg0);

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
    public class498(int arg0) {
        this.field7027 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1990(byte arg0);

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)I")
    public static final int method2966(int arg0) {
        if (arg0 != 1) {
            method2967(65, 9, -78, null, null);
        }
        field7029++;
        return class744.field10390;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIILjb;Ljb;)V")
    public static final void method2967(int arg0, int arg1, int arg2, class492 arg3, class492 arg4) {
        class691 var5 = class510.method3014(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field9728 = arg3;
        var5.field9725 = arg4;
        int var6 = class504.field7120 == class159.field1758 ? 1 : 0;
        if (!arg3.method986(-113)) {
            arg3.field4634 = class228.field2626[var6];
            class228.field2626[var6] = arg3;
        } else if (arg3.method989(-117)) {
            arg3.field4634 = class300.field3729[var6];
            class300.field3729[var6] = arg3;
        } else {
            arg3.field4634 = class436.field6357[var6];
            class436.field6357[var6] = arg3;
            class568.field8076 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method986(50)) {
            if (arg4.method989(-125)) {
                arg4.field4634 = class300.field3729[var6];
                class300.field3729[var6] = arg4;
                return;
            }
            arg4.field4634 = class436.field6357[var6];
            class436.field6357[var6] = arg4;
            class568.field8076 = true;
            return;
        }
        arg4.field4634 = class228.field2626[var6];
        class228.field2626[var6] = arg4;
    }
}
