import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class536 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lgd;")
    public static class284 field7517 = null;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field7518 = 0;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "F")
    public static float field7521;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field7514;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public int field7515;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public int field7519;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field7522;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lha;")
    public static class52 field7516;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 6)
    public static void method3054(int arg0) {
        field7517 = null;
        if (arg0 != -12) {
            field7521 = 1.6292387F;
        }
        field7516 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method3055(int arg0, int arg1, int arg2) {
        field7523++;
        class437 var3 = class16.field126.method1759(false, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg1 != 25608) {
            method3055(-15, -83, 7);
        }
        return var3.method2547(arg0, (byte) -78);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)I", line = 54)
    public static final int method3056(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 112) {
            method3056(39, -94, -54, -84);
        }
        field7520++;
        if (arg2 < arg3) {
            return arg3;
        } else if (arg2 <= arg0) {
            return arg2;
        } else {
            return arg0;
        }
    }
}
