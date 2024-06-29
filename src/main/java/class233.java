import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class233 implements class72 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "[J")
    public static long[] field3510 = new long[10];

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "[[Z")
    public static boolean[][] field3511 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Luh;[IIJ)Ljava/lang/String;")
    public final String method583(class176 arg0, int[] arg1, int arg2, long arg3) {
        field3513++;
        if (class473.field6634 == arg0) {
            class759 var6 = class88.field998.method741(arg1[0], (byte) -125);
            return var6.method4221((int) arg3, 87);
        }
        if (arg2 != 0) {
            method1564(66);
        }
        if (class652.field9110 == arg0 || class167.field2631 == arg0) {
            class689 var7 = class313.field4456.method1681((int) arg3, 100);
            return var7.field9565;
        } else if (class47.field595 == arg0 || class199.field3045 == arg0 || class741.field10218 == arg0) {
            return class88.field998.method741(arg1[0], (byte) -127).method4221((int) arg3, -73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method1564(int arg0) {
        if (arg0 != 31936) {
            method1564(1);
        }
        field3511 = null;
        field3510 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZZZII)I")
    public static final int method1565(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field3512++;
        class787 var5 = class447.method2666(arg4, Integer.MIN_VALUE, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg2) {
            method1564(119);
        }
        while (var5.field10809.length > var7) {
            if (var5.field10809[var7] >= 0 && class313.field4456.field3769 > var5.field10809[var7]) {
                class689 var8 = class313.field4456.method1681(var5.field10809[var7], 106);
                int var9 = var8.method3883(arg3, (byte) -124, class184.field2832.method4117((byte) 49, arg3).field9011);
                if (arg1) {
                    var6 += var5.field10805[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
            var7++;
        }
        return var6;
    }
}
