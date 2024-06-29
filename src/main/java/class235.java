import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class235 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3541 = "Please wait...";

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field3551 = 3353893;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[S")
    public static short[] field3547 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3549 = Calendar.getInstance();

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Z")
    public static boolean field3556 = true;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)I")
    public static final int method1545(int arg0, byte arg1) {
        if (arg1 == -47) {
            field3555++;
            return arg0 & 0xFF;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1546(String arg0, String arg1, String arg2, int arg3) {
        field3550++;
        int var4 = 97 % ((48 - arg3) / 53);
        for (int var5 = arg0.indexOf(arg1); var5 != -1; var5 = arg0.indexOf(arg1, var5 + arg2.length())) {
            arg0 = arg0.substring(0, var5) + arg2 + arg0.substring(arg1.length() + var5);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lkl;")
    public static final class114 method1547(int arg0) {
        class114 var1 = new class114(34);
        var1.method775(11, -115);
        var1.method775(class92.field1401, -121);
        field3542++;
        var1.method775(class155.field2272 ? 1 : 0, -117);
        var1.method775(class1.field17 ? 1 : 0, arg0 ^ 0xFFFFFF91);
        var1.method775(class48.field695 ? 1 : 0, -114);
        var1.method775(class193.field2760 ? 1 : 0, -114);
        var1.method775(class242.field3626 ? 1 : 0, arg0 ^ 0xFFFFFF87);
        var1.method775(field3556 ? 1 : 0, arg0 ^ 0xFFFFFF8D);
        var1.method775(class234.field3516 ? 1 : 0, -118);
        var1.method775(class1.field11 ? 1 : 0, -111);
        var1.method775(class264.field3967, -122);
        var1.method775(class42.field606 ? 1 : 0, -128);
        var1.method775(class147.field2100 ? 1 : 0, -123);
        var1.method775(class290.field4579 ? 1 : 0, arg0 ^ 0xFFFFFF8B);
        var1.method775(class148.field2112, -112);
        var1.method775(class195.field2797 ? 1 : 0, arg0 ^ 0xFFFFFF8D);
        var1.method775(class32.field473, arg0 - 113);
        var1.method775(class209.field3015, arg0 ^ 0xFFFFFF8C);
        var1.method775(class62.field1000, -117);
        var1.method794(class194.field2784, (byte) -52);
        var1.method794(class13.field199, (byte) -126);
        if (arg0 != 0) {
            method1549(21, (class72) null, -119, -97);
        }
        var1.method775(class112.method726(), arg0 - 122);
        var1.method737(arg0 ^ 0xFFFFF5AB, class190.field2708);
        var1.method775(class161.field2333, -125);
        var1.method775(class207.field2997 ? 1 : 0, -118);
        var1.method775(class107.field1555 ? 1 : 0, -116);
        var1.method775(class185.field2645, arg0 - 126);
        var1.method775(class66.field1030 ? 1 : 0, -124);
        var1.method775(class262.field3949 ? 1 : 0, arg0 - 122);
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field3541 = null;
        if (arg0 != 1) {
            field3547 = null;
        }
        field3547 = null;
        field3549 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILth;II)V")
    public static final void method1549(int arg0, class72 arg1, int arg2, int arg3) {
        field3546++;
        if (arg2 != -1) {
            field3540 = -49;
        }
        if (arg1.field98 == arg0 && arg0 != -1) {
            class196 var4 = class70.method478(arg0, false);
            int var5 = var4.field2820;
            if (var5 == 1) {
                arg1.field133 = 0;
                arg1.field88 = arg3;
                arg1.field37 = 0;
                arg1.field38 = 0;
                arg1.field63 = 1;
                class206.method1327(arg1.field38, -76, var4, false, arg1.field94, arg1.field45);
            }
            if (var5 == 2) {
                arg1.field37 = 0;
            }
        } else if (arg0 == -1 || arg1.field98 == -1 || class70.method478(arg0, false).field2830 >= class70.method478(arg1.field98, false).field2830) {
            arg1.field88 = arg3;
            arg1.field37 = 0;
            arg1.field103 = arg1.field84;
            arg1.field38 = 0;
            arg1.field63 = 1;
            arg1.field133 = 0;
            arg1.field98 = arg0;
            if (arg1.field98 == -1) {
                return;
            }
            class206.method1327(arg1.field38, arg2 + 56, class70.method478(arg1.field98, false), false, arg1.field94, arg1.field45);
        }
    }
}
