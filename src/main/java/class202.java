import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class202 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lst;")
    public static class335 field2676 = new class335(81, 3);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[[I")
    public static int[][] field2678 = new int[128][128];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field2679;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    public static boolean field2680;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLmba;Lha;II)V", line = 6)
    public static final void method1227(boolean arg0, class646 arg1, class548 arg2, int arg3, int arg4) {
        class226.field3034.method3615((byte) 110);
        field2677++;
        if (class487.field6815) {
            return;
        }
        class717 var5 = (class717) arg1.method3618(-128);
        if (arg0) {
            method1227(false, null, null, 31, 114);
        }
        while (var5 != null) {
            class21 var6 = class461.field6385.method11(120, var5.field9990);
            if (class332.method2125(var6, true)) {
                boolean var7 = class720.method4032(arg4, arg2, var6, 0, arg3, var5);
                if (var7) {
                    class231.method1377(arg2, var6, var5, (byte) 114);
                }
            }
            var5 = (class717) arg1.method3619(0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 40)
    public static void method1228(int arg0) {
        if (arg0 == 128) {
            field2676 = null;
            field2678 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "toString", descriptor = "()Ljava/lang/String;", line = 53)
    public final String toString() {
        field2675++;
        throw new IllegalStateException();
    }
}
