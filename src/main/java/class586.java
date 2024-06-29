import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class586 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
    public static int[] field8250 = new int[64];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lpca;")
    public static class666 field8249 = new class666();

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lsc;")
    public static class317 field8252 = class554.method3111(-4141);

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
    public static int[] field8254 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lch;")
    public static class428 field8253;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 8)
    public static void method3333(byte arg0) {
        if (arg0 >= -111) {
            method3335(-121, -21, 84, true, -93, -99, 114);
        }
        field8254 = null;
        field8250 = null;
        field8249 = null;
        field8252 = null;
        field8253 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z", line = 27)
    public static final boolean method3334(byte arg0) {
        field8248++;
        try {
            if (class450.field6183 == 2) {
                if (class233.field3228 == null) {
                    class233.field3228 = class632.method3540(class4.field34, class131.field1891, class542.field7334);
                    if (class233.field3228 == null) {
                        return false;
                    }
                }
                if (class479.field6600 == null) {
                    class479.field6600 = new class306(class677.field9694, class383.field5426);
                }
                class364 var1 = class224.field3124;
                if (class123.field1688 != null) {
                    var1 = class123.field1688;
                }
                if (var1.method2086(22050, class691.field9859, class233.field3228, class479.field6600, 13944)) {
                    class224.field3124 = var1;
                    class224.field3124.method2098(-11866);
                    if (class500.field6814 > 0) {
                        class450.field6183 = 3;
                        class224.field3124.method2084((byte) -78, class500.field6814 > class129.field1848 ? class129.field1848 : class500.field6814);
                        for (int var2 = 0; var2 < class287.field3957.length; var2++) {
                            class224.field3124.method2094(var2, true, class287.field3957[var2]);
                            class287.field3957[var2] = 255;
                        }
                    } else {
                        class450.field6183 = 0;
                        class224.field3124.method2084((byte) -78, class129.field1848);
                        for (int var3 = 0; var3 < class287.field3957.length; var3++) {
                            class224.field3124.method2094(var3, true, class287.field3957[var3]);
                            class287.field3957[var3] = 255;
                        }
                    }
                    if (class123.field1688 == null) {
                        if (class628.field8700 <= 0L) {
                            class224.field3124.method2093(class233.field3228, 2, class439.field6090);
                        } else {
                            class224.field3124.method2095(111, class628.field8700, class233.field3228, true, class439.field6090);
                        }
                    }
                    if (class114.field1574 != null) {
                        class114.field1574.method3554(class224.field3124, 4);
                    }
                    class233.field3228 = null;
                    class4.field34 = null;
                    class628.field8700 = 0L;
                    class479.field6600 = null;
                    class123.field1688 = null;
                    return true;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class224.field3124.method2099((byte) 62);
            class123.field1688 = null;
            class450.field6183 = 0;
            class479.field6600 = null;
            class4.field34 = null;
            class233.field3228 = null;
        }
        int var5 = -113 / ((arg0 - 29) / 47);
        return false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIZIII)V", line = 126)
    public static final void method3335(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 != (arg3 ? class366.field4875.field9381 : class366.field4875.field9346) && arg1 != 0 && class166.field2420 < 50 && arg4 != -1) {
            class130.field1873[class166.field2420++] = new class437((byte) (arg3 ? 3 : 2), arg4, arg1, arg6, arg5, 0, arg0, null);
        }
        field8251++;
    }
}
