import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class108 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    public static int[] field1721 = new int[100];

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1725 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lne;")
    public static class52 field1718;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method814(int arg0) {
        if (arg0 != 0) {
            method815(90, -43, 36, -31, -8, 49, -9);
        }
        field1721 = null;
        field1718 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1724++;
        class25[] var7 = class217.field3360;
        for (int var8 = arg2; var8 < var7.length; var8++) {
            class25 var9 = var7[var8];
            if (var9 != null && var9.field385 == 2) {
                class25.method201(true, arg3 >> 1, arg0, (var9.field377 - class129.field2008 << 7) + var9.field379, (var9.field375 - class118.field1828 << 7) + var9.field386, arg4 >> 1, var9.field382 * 2, arg5);
                if (class275.field4324 > -1 && class267.field4256 % 20 < 10) {
                    class188.field3005[var9.field374].method45(arg1 - (12 - class275.field4324), class256.field3921 + arg6 + -28);
                }
            }
        }
    }
}
