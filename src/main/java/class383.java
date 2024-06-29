import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class383 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
    public static boolean field5731 = false;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field5733 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "J")
    public static long field5732;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field5728;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2516(int arg0, int arg1, int arg2, int arg3) {
        field5730++;
        if ((class37.field606[arg3][arg0][arg2] & 0x8) == 0) {
            if (arg1 >= -17) {
                method2517(-55);
            }
            return arg3 <= 0 || (class37.field606[1][arg0][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 27)
    public static void method2517(int arg0) {
        int var1 = -29 % ((arg0 + 35) / 53);
        field5728 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB)V", line = 44)
    public static final void method2518(int arg0, int arg1, byte arg2) {
        field5727++;
        class256 var3 = class363.method2385(15, 0, (byte) 1);
        var3.method1614(0);
        var3.field3756 = arg1;
        if (arg2 != 126) {
            method2518(-110, 6, (byte) 58);
        }
        var3.field3746 = arg0;
    }
}
