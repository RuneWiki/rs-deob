import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class182 extends class259 {

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2731 = "K";

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Laf;")
    public static class176 field2736 = null;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field2732 = -1;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[I")
    public int[] field2726;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[I")
    public int[] field2728;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
    public int[] field2737;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[Lvf;")
    public class60[] field2733;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[Lvf;")
    public class60[] field2734;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[[[B")
    public byte[][][] field2729;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method1282(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        class199.field2936 = (short) arg1;
        int var6 = 114 % ((arg0 + 7) / 32);
        class126.field2129 = (short) arg3;
        field2730++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Llc;Llc;I)I")
    public static final int method1283(class270 arg0, class270 arg1, int arg2) {
        field2735++;
        if (arg2 != -26313) {
            method1282((byte) 5, 27, -102, 122, 127, true);
        }
        int var3 = 0;
        if (arg0.method1885(2, class222.field3261)) {
            var3++;
        }
        if (arg0.method1885(2, class9.field102)) {
            var3++;
        }
        if (arg0.method1885(2, class291.field4634)) {
            var3++;
        }
        if (arg1.method1885(arg2 ^ 0xFFFF9935, class222.field3261)) {
            var3++;
        }
        if (arg1.method1885(arg2 ^ 0xFFFF9935, class9.field102)) {
            var3++;
        }
        if (arg1.method1885(2, class291.field4634)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field2736 = null;
        field2731 = null;
        if (arg0 != 1) {
            field2727 = -16;
        }
    }
}
