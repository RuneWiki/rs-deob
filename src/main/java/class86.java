import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class86 {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lob;")
    private static class141 field1714 = class175.method1195(40, "M");

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lob;")
    public static class141 field1708 = field1714;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lob;")
    public static class141 field1717 = field1714;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lob;")
    public static class141 field1715 = null;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Z")
    public static boolean field1713 = false;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Log;")
    public static class146 field1709;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lic;")
    public static final class83 method586(int arg0, int arg1) {
        field1707++;
        class83 var2 = (class83) class91.field1813.method1383((long) arg1, (byte) 83);
        if (arg0 < 40) {
            method586(51, -127);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field2293.method1065((byte) 52, class17.method106(-91, arg1), class39.method260(28905, arg1));
        class83 var4 = new class83();
        if (var3 != null) {
            var4.method571(15291, new class146(var3));
        }
        class91.field1813.method1378(var4, (byte) -44, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method587(int arg0) {
        field1711++;
        if (!class191.field3685) {
            return;
        }
        class85.field1701 = null;
        class111.field2136 = null;
        class131.field2505 = null;
        class224.field4230 = null;
        class83.field1662 = null;
        class11.field222 = null;
        class92.field1838 = null;
        class195.field3726 = null;
        class204.field3898 = null;
        class157.field3023 = null;
        class57.field1115 = null;
        class142.field2748 = null;
        class9.field149 = null;
        class159.field3071 = null;
        class162.field3150 = null;
        class218.field4143 = null;
        class136.field2593 = null;
        class47.field897 = null;
        class146.field2798 = null;
        class169.field3244 = null;
        class117.field2288 = null;
        class107.field2051 = null;
        class153.method1053((byte) 121, arg0);
        class160.method1121(true, -8496);
        class191.field3685 = false;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method588(int arg0) {
        field1715 = null;
        field1708 = null;
        field1714 = null;
        field1717 = null;
        int var1 = 15 % ((arg0 + 56) / 53);
        field1709 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILdg;)V")
    public static final void method589(int arg0, int arg1, int arg2, class38 arg3) {
        if (arg1 != 0) {
            return;
        }
        field1712++;
        if (arg3.field3851 == arg0 && arg0 != -1) {
            class26 var4 = class114.method736(arg1 + 15619, arg0);
            int var5 = var4.field493;
            if (var5 == 1) {
                arg3.field3862 = 0;
                arg3.field3875 = 0;
                arg3.field3841 = 0;
                arg3.field3861 = arg2;
                class9.method60(arg3.field3889, var4, false, arg3.field3875, class114.field2176 == arg3, arg3.field3854);
            }
            if (var5 == 2) {
                arg3.field3862 = 0;
                return;
            }
        } else if (arg0 == -1 || arg3.field3851 == -1 || class114.method736(15619, arg0).field482 >= class114.method736(15619, arg3.field3851).field482) {
            arg3.field3861 = arg2;
            arg3.field3875 = 0;
            arg3.field3862 = 0;
            arg3.field3841 = 0;
            arg3.field3893 = arg3.field3832;
            arg3.field3851 = arg0;
            if (arg3.field3851 != -1) {
                class9.method60(arg3.field3889, class114.method736(15619, arg3.field3851), false, arg3.field3875, class114.field2176 == arg3, arg3.field3854);
                return;
            }
        } else {
            return;
        }
    }
}
