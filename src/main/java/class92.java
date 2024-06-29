import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class92 extends class15 {

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lse;")
    public class357 field1141;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Z")
    public static boolean field1148 = true;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field1149 = 12;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Z")
    public static boolean field1146;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "[Lrg;")
    public static class395[] field1147;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[Z")
    public static boolean[] field1150;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 9)
    public static void method457(int arg0) {
        field1150 = null;
        field1147 = null;
        if (arg0 <= 12) {
            method457(13);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLab;III)V", line = 25)
    public static final void method458(boolean arg0, class256 arg1, int arg2, int arg3, int arg4) {
        field1142++;
        int var5 = arg1.field3597;
        if (arg2 != -29507) {
            method458(true, (class256) null, -74, -21, 108);
        }
        int var6 = arg1.field3707;
        if (arg1.field3588 == 0) {
            arg1.field3597 = arg1.field3580;
        } else if (arg1.field3588 == 1) {
            arg1.field3597 = arg3 - arg1.field3580;
        } else if (arg1.field3588 == 2) {
            arg1.field3597 = arg1.field3580 * arg3 >> 14;
        }
        if (arg1.field3612 == 0) {
            arg1.field3707 = arg1.field3589;
        } else if (arg1.field3612 == 1) {
            arg1.field3707 = arg4 - arg1.field3589;
        } else if (arg1.field3612 == 2) {
            arg1.field3707 = arg1.field3589 * arg4 >> 14;
        }
        if (arg1.field3588 == 4) {
            arg1.field3597 = arg1.field3707 * arg1.field3665 / arg1.field3669;
        }
        if (arg1.field3612 == 4) {
            arg1.field3707 = arg1.field3669 * arg1.field3597 / arg1.field3665;
        }
        if (class192.field2640 && (client.method1660(arg1).field4087 != 0 || arg1.field3654 == 0)) {
            if (arg1.field3707 < 5 && arg1.field3597 < 5) {
                arg1.field3597 = 5;
                arg1.field3707 = 5;
            } else {
                if (arg1.field3597 <= 0) {
                    arg1.field3597 = 5;
                }
                if (arg1.field3707 <= 0) {
                    arg1.field3707 = 5;
                }
            }
        }
        if (class437.field6276 == arg1.field3591) {
            class187.field2526 = arg1;
        }
        if (arg0 && arg1.field3632 != null && arg1.field3597 != var5 || arg1.field3707 != var6) {
            class35 var7 = new class35();
            var7.field429 = arg1;
            var7.field435 = arg1.field3632;
            class12.field177.method803(var7, 50);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lse;)V", line = 120)
    public class92(class357 arg0) {
        this.field1141 = arg0;
    }
}
