import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class454 extends class429 {

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!mea", name = "L", descriptor = "Z")
    public static boolean field6201 = false;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "F")
    public static float field6197;

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!mea", name = "M", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method2622(int arg0, int arg1, byte arg2) {
        if (arg2 >= -12) {
            method2623(-104, 1, 69, -24, -32, 100);
        }
        field6199++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIII)Z", line = 18)
    public static final boolean method2623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6200++;
        if (arg0 != 1) {
            return true;
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            for (int var7 = arg4; var7 <= arg1; var7++) {
                if (class74.field1069[var6][var7] == arg5 && class78.field1107[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)Laca;", line = 54)
    public final class758 method228(int arg0) {
        field6196++;
        if (arg0 != 1) {
            this.field6198 = 77;
        }
        return class564.field7991;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)Ltc;", line = 66)
    public static final class373 method2624(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7462;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 77)
    public static final boolean method2625(int arg0, String arg1) {
        field6202++;
        if (arg0 != 10) {
            field6201 = true;
        }
        return class98.method869(arg1, 10, 6114, true);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Leaa;Lcq;IIIIIIIIIIIIII)V", line = 88)
    public class454(class528 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field6198 = arg15;
    }
}
