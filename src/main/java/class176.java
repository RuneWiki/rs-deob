import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class176 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lma;")
    private static class5 field2682 = class12.method119("white:", (byte) 118);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lma;")
    public static class5 field2688 = field2682;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lma;")
    public static class5 field2692 = field2682;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2687;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public static int[] field2684;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[Leb;")
    public static class253[] field2690;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 8)
    public static void method1150(int arg0) {
        int var1 = 72 / ((-arg0 - 43) / 45);
        field2684 = null;
        field2682 = null;
        field2687 = null;
        field2688 = null;
        field2692 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 33)
    public static final void method1151(int arg0, int arg1) {
        field2686++;
        if (arg1 == -1 || !class186.method1226(arg1, 0)) {
            return;
        }
        class253[] var2 = class256.field4376[arg1];
        if (arg0 < 114) {
            method1150(2);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class253 var4 = var2[var3];
            if (var4.field4282 != null) {
                class256 var5 = new class256();
                var5.field4372 = var4.field4282;
                var5.field4382 = var4;
                class80.method547(2000000, true, var5);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZLeb;)V", line = 75)
    public static final void method1152(int arg0, int arg1, int arg2, boolean arg3, class253 arg4) {
        field2691++;
        class124.method822(arg2, arg0, arg4.field4228 + arg2, arg4.field4190 + arg0);
        if (class100.field1499 >= 3) {
            class237 var5 = arg4.method1774(-76, false);
            if (var5 != null) {
                var5.method213(arg2, arg0);
            }
        } else {
            ((class109) class65.field1026).method728(arg2, arg0, arg4.field4228, arg4.field4190, class65.field1026.field3918 / 2, class65.field1026.field3914 / 2, class24.field416, 256, (class109) arg4.method1774(-62, false));
        }
        class52.field822[arg1] = arg3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIILkb;IJIIII)Z", line = 106)
    public static final boolean method1153(int arg0, int arg1, int arg2, int arg3, class280 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class204.method1356(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
