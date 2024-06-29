import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class439 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Ldl;")
    public class79 field6454 = new class79();

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Z")
    public boolean field6457 = false;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field6455 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[B")
    public static byte[] field6456 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZIB)I")
    public static final int method2691(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field6460++;
        class148 var5 = class432.method2655((byte) 114, arg2, arg3);
        if (var5 == null) {
            return 0;
        } else if (arg4 <= 73) {
            return -60;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field2045.length; var7++) {
                if (var5.field2045[var7] >= 0 && var5.field2045[var7] < class186.field2796.field2743) {
                    class167 var8 = class186.field2796.method1106(50, var5.field2045[var7]);
                    int var9 = var8.method1002(-30283, arg1, class19.method123(arg1, (byte) -80).field186);
                    if (arg0) {
                        var6 += var5.field2049[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method2692(int arg0) {
        field6456 = null;
        if (arg0 != -7780) {
            method2691(false, 32, true, -88, (byte) -35);
        }
    }
}
