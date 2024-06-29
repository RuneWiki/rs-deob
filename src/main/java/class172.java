import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class172 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method1087(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        field2770++;
        if (arg0 != 10) {
            return false;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class31 var3 = class277.method1864(arg1, 0);
        return var3.method246(arg2, (byte) -117);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IS)Z", line = 44)
    public static final boolean method1088(int arg0, short arg1) {
        field2767++;
        if (arg1 == 47 || arg1 == 36 || arg1 == 26 || arg1 == 2 || arg1 == 38 || arg1 == 28 || arg1 == 15 || arg1 == 11) {
            return true;
        }
        if (arg0 != 39) {
            field2769 = -107;
        }
        if (arg1 == 30 || arg1 == 7 || arg1 == 1007 || arg1 == 1006) {
            return true;
        } else if (arg1 == 46 || arg1 == 34 || arg1 == 37 || arg1 == 13 || arg1 == 19) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 10 || arg1 == 40 || arg1 == 32 || arg1 == 1 || arg1 == 39;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILbm;Lbm;)V", line = 81)
    public static final void method1089(int arg0, class307 arg1, class307 arg2) {
        class295.field4507 = arg1;
        field2771++;
        int var3 = 127 % ((arg0 - 25) / 56);
        class325.field4960 = arg2;
        class254.field3970 = class295.field4507.method2056(3, -105);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILga;II)V", line = 110)
    public static final void method1090(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        field2772++;
        if (arg4 != 0) {
            field2769 = 91;
        }
        for (class174 var5 = (class174) class233.field3643.method424(-56); var5 != null; var5 = (class174) class233.field3643.method425(-32547)) {
            if (var5.field2803 == arg3 && (arg0 * 128) == var5.field2791 && (arg1 * 128) == var5.field2795 && var5.field2799.field596 == arg2.field596) {
                if (var5.field2789 != null) {
                    class11.field230.method1237(var5.field2789);
                    var5.field2789 = null;
                }
                if (var5.field2780 != null) {
                    class11.field230.method1237(var5.field2780);
                    var5.field2780 = null;
                }
                var5.method278((byte) -105);
                return;
            }
        }
    }
}
