import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class144 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ldc;")
    public static class37 field2757 = class185.method1233((byte) 86, "Die Verbindung konnte");

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lbb;")
    public static class14 field2760 = new class14(100);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Ldc;")
    private static class37 field2764 = class185.method1233((byte) 86, "Fri");

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ldc;")
    private static class37 field2765 = class185.method1233((byte) 86, "Thu");

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Ldc;")
    private static class37 field2769 = class185.method1233((byte) 86, "Wed");

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Ldc;")
    private static class37 field2770 = class185.method1233((byte) 86, "Tue");

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ldc;")
    private static class37 field2766 = class185.method1233((byte) 86, "Sun");

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Ldc;")
    private static class37 field2771 = class185.method1233((byte) 86, "Sat");

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Ldc;")
    private static class37 field2767 = class185.method1233((byte) 86, "Mon");

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[Ldc;")
    public static class37[] field2772 = new class37[] { field2766, field2767, field2770, field2769, field2765, field2764, field2771 };

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ldj;")
    public static class44 field2768;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[Ljc;")
    public static class100[] field2758;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lnh;")
    public static final class149 method998(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        return var3 == null || var3.field295 == null ? null : var3.field295;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method999(int arg0) {
        int var1 = 0;
        if (arg0 < 116) {
            field2771 = null;
        }
        while (class19.field309 > var1) {
            int var2 = class214.field4000[var1];
            class123 var3 = class8.field107[var2];
            int var4 = class12.field167.method215(-1797813752);
            if ((var4 & 0x8) != 0) {
                var4 += class12.field167.method215(-1797813752) << 8;
            }
            class124.method842(true, var2, var3, var4);
            var1++;
        }
        field2762++;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        field2759++;
        class140.field2715.method93(0);
        field2760.method93(0);
        int var1 = 114 % ((-arg0 - 36) / 43);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method1001(byte arg0) {
        field2768 = null;
        field2771 = null;
        field2767 = null;
        if (arg0 <= 34) {
            return;
        }
        field2764 = null;
        field2772 = null;
        field2757 = null;
        field2769 = null;
        field2770 = null;
        field2766 = null;
        field2765 = null;
        field2760 = null;
        field2758 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
    public static final int method1002(byte arg0, int arg1) {
        field2761++;
        return arg0 == 47 ? arg1 & 0xFF : 19;
    }
}
