import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class671 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "[I")
    public static int[] field9530 = new int[13];

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lpca;")
    public static class653 field9534 = new class653(64);

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lpr;")
    public static class407 field9537 = new class407(70, 7);

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Z")
    public static boolean field9538 = false;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Lw;")
    public class269 field9533;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lba;")
    public class350 field9536;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 4)
    public static void method3761(byte arg0) {
        field9537 = null;
        field9534 = null;
        int var1 = 123 / ((arg0 - 12) / 52);
        field9530 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(CI)Z", line = 18)
    public static final boolean method3762(char arg0, int arg1) {
        field9535++;
        if (arg1 == 0) {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljo;IBIIZI)V", line = 32)
    public static final void method3763(class303 arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class636.field9006 = 1;
        field9531++;
        if (arg2 > -10) {
            return;
        }
        class41.field434 = arg3;
        class36.field411 = arg1;
        class385.field5149 = arg5;
        class377.field4896 = arg4;
        class692.field9747 = arg0;
        class602.field8542 = class112.field1304.method631((byte) -30) / arg6;
        if (class602.field8542 < 1) {
            class602.field8542 = 1;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIIZB)Z", line = 55)
    public static final boolean method3764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8) {
        field9532++;
        int var9 = class377.field4914.field3839[0];
        int var10 = class377.field4914.field3841[0];
        if (var9 < 0 || var9 >= class399.field5338 || var10 < 0 || var10 >= class349.field4567) {
            return false;
        } else if (arg8 >= -29) {
            return false;
        } else if (arg2 >= 0 && arg2 < class399.field5338 && arg6 >= 0 && arg6 < class349.field4567) {
            int var11 = class292.method1662(arg0, class7.field57, arg6, arg5, class475.field6919[class377.field4914.field4638], arg3, -111, arg1, arg7, arg2, class475.field6920, arg4, class377.field4914.method1656(true), var10, var9);
            if (var11 < 1) {
                return false;
            }
            class377.field4897 = class7.field57[var11 - 1];
            class319.field4130 = class475.field6920[var11 - 1];
            class607.field8573 = false;
            class215.method1284(-91);
            return true;
        } else {
            return false;
        }
    }
}
